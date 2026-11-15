# 📚 DSA — Stacks & Queues, Flipped Upside Down

> "A stack is just a queue that's had a really weird day."

Welcome to my **Data Structures & Algorithms** playground! This repository holds my **CA3 Submission 1**: four Java implementations that bend stacks and queues into each other, plus a stack that never runs out of room.

---

## 🧰 What's Inside

| # | File | The Idea | Push / Enqueue | Pop / Dequeue |
|---|------|----------|:---:|:---:|
| 1 | `QueueStackPushFriendly.java` | A **stack** built from two **queues**, optimised for fast pushing | O(1) ⚡ | O(n) 🐢 |
| 2 | `QueueStackPopFriendly.java` | A **stack** built from two **queues**, optimised for fast popping | O(n) 🐢 | O(1) ⚡ |
| 3 | `UnboundedArrayStack.java` | An array **stack** that grows *and* shrinks on demand | O(1) amortized | O(1) amortized |
| 4 | `StackQueueEnqueueFriendly.java` | A **queue** built from two **stacks**, optimised for fast enqueueing | O(1) ⚡ | O(n) 🐢 |

---

## 🎭 The Stories Behind Each File

### 1️⃣ QueueStack — Push Friendly
Pushing is effortless: just join the line. Popping is the hard part. To reach the *last* person in the queue, everyone else steps into a second queue first, then the last one leaves, and the two queues swap roles.

### 2️⃣ QueueStack — Pop Friendly
The mirror image. Every new element does the hard work upfront by rotating itself to the front of the line. The reward? Popping is a simple "next, please!"

### 3️⃣ Unbounded Array Stack
The stack with a shape-shifting backpack 🎒
- **Full?** Capacity **doubles**.
- **Only a quarter full?** Capacity **halves** (it never shrinks below the starting size).

No overflow, no wasted space, and it resizes during **both** push and pop.

### 4️⃣ StackQueue — Enqueue Friendly
Two stacks, one queue. Enqueueing is a single push. Dequeuing means pouring everything into the second stack (which reverses the order), taking the front item, then pouring it all back.

---

## 🚀 Run It Yourself

You need the **JDK** installed. Every file has its own `main` method with a mini demo.

```bash
# compile
javac QueueStackPushFriendly.java

# run
java QueueStackPushFriendly
```

Swap in any file name from the table above.

### 👀 Sample output (UnboundedArrayStack)

```
  [resize -> capacity 8]
  [resize -> capacity 16]
  [resize -> capacity 32]
Size: 17, Capacity: 32
  [resize -> capacity 16]
  [resize -> capacity 8]
  [resize -> capacity 4]
Size: 0, Capacity: 4
```

Watch the capacity climb up while pushing, then shrink back down while popping. 🎢

---

## 🧠 Key Takeaways

- **Trade-offs are everything.** You can make push cheap or pop cheap, but not both, when you build a stack from queues.
- **Amortized thinking pays off.** Doubling and halving keeps the average cost per operation constant.
- **LIFO and FIFO are two sides of one coin.** Two of one kind can imitate the other.

---

## 🗂️ Repository Structure

```
DSA/
├── QueueStackPushFriendly.java
├── QueueStackPopFriendly.java
├── UnboundedArrayStack.java
├── StackQueueEnqueueFriendly.java
└── README.md
```

---

## 👋 About

Made with ☕ and a lot of `push()` and `pop()` as part of my DSA coursework.

⭐ If this helped you understand stacks and queues a little better, feel free to star the repo!
