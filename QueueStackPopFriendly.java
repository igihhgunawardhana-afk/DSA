import java.util.LinkedList;
import java.util.Queue;

/**
 * Stack implemented using Queues - POP FRIENDLY.
 * push: O(n)  (after enqueue, rotate so the newest element is at the front)
 * pop : O(1)  (just dequeue)
 */
public class QueueStackPopFriendly {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> tmp = q1; q1 = q2; q2 = tmp;
    }

    public int pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return q1.remove();
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public int size() {
        return q1.size();
    }

    public static void main(String[] args) {
        QueueStackPopFriendly s = new QueueStackPopFriendly();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Pop: " + s.pop());   // 30
        System.out.println("Peek: " + s.peek()); // 20
        System.out.println("Pop: " + s.pop());   // 20
        System.out.println("Pop: " + s.pop());   // 10
        System.out.println("Empty: " + s.isEmpty());
    }
}
