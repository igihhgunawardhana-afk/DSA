import java.util.LinkedList;
import java.util.Queue;

/**
 * Stack implemented using Queues - PUSH FRIENDLY.
 * push: O(1)  (just enqueue)
 * pop : O(n)  (move n-1 elements to the other queue, dequeue the last one)
 */
public class QueueStackPushFriendly {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        int top = q1.remove();
        Queue<Integer> tmp = q1; q1 = q2; q2 = tmp;
        return top;
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        int top = q1.peek();
        q2.add(q1.remove());
        Queue<Integer> tmp = q1; q1 = q2; q2 = tmp;
        return top;
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public int size() {
        return q1.size();
    }

    public static void main(String[] args) {
        QueueStackPushFriendly s = new QueueStackPushFriendly();
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
