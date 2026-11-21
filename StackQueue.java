import java.util.Stack;

/**
 * Queue implemented using two stacks.
 * Enqueue is O(n), while dequeue and peek are O(1).
 * This version is optimized for frequent dequeue operations.
 */
public class StackQueue {
    private Stack<Integer> items = new Stack<>();

    public void enqueue(int value) {
        Stack<Integer> temp = new Stack<>();

        while (!items.isEmpty()) {
            temp.push(items.pop());
        }

        items.push(value);

        while (!temp.isEmpty()) {
            items.push(temp.pop());
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return items.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return items.peek();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }

    public static void main(String[] args) {
        StackQueue queue = new StackQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Size: " + queue.size());
    }
}
