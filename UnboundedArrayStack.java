/**
 * Unbounded Array Stack.
 * The backing array dynamically changes size during BOTH operations:
 *  - push: when the array is full, capacity is doubled.
 *  - pop : when the stack is only 1/4 full, capacity is halved
 *          (never below the initial capacity).
 */
public class UnboundedArrayStack {
    private static final int INITIAL_CAPACITY = 4;

    private int[] data = new int[INITIAL_CAPACITY];
    private int top = 0; // number of elements

    public void push(int x) {
        if (top == data.length) {
            resize(data.length * 2);
        }
        data[top++] = x;
    }

    public int pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        int value = data[--top];
        if (data.length > INITIAL_CAPACITY && top <= data.length / 4) {
            resize(data.length / 2);
        }
        return value;
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return data[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    public int capacity() {
        return data.length;
    }

    private void resize(int newCapacity) {
        int[] newData = new int[newCapacity];
        for (int i = 0; i < top; i++) {
            newData[i] = data[i];
        }
        data = newData;
        System.out.println("  [resize -> capacity " + newCapacity + "]");
    }

    public static void main(String[] args) {
        UnboundedArrayStack s = new UnboundedArrayStack();
        for (int i = 1; i <= 17; i++) {
            s.push(i);
        }
        System.out.println("Size: " + s.size() + ", Capacity: " + s.capacity());
        while (!s.isEmpty()) {
            s.pop();
        }
        System.out.println("Size: " + s.size() + ", Capacity: " + s.capacity());
    }
}
