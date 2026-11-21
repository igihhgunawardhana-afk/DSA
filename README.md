# 📚 DSA — Stacks, Queues & Linked Lists

> "A stack is just a queue that's had a really weird day."

Welcome to my **Data Structures & Algorithms** playground! This repository contains my **CA3 Submissions 1 & 2**: eight Java implementations exploring stacks, queues, and linked lists, including different ways to optimise operations and manage data efficiently.

---

## 🧰 What's Inside

### 📌 Submission 1 — Stacks & Queues

| # | File | The Idea | Push / Enqueue | Pop / Dequeue |
|---|---|---|---|---|
| 1 | `QueueStackPushFriendly.java` | A stack built from two queues, optimised for fast pushing | O(1) ⚡ | O(n) 🐢 |
| 2 | `QueueStackPopFriendly.java` | A stack built from two queues, optimised for fast popping | O(n) 🐢 | O(1) ⚡ |
| 3 | `UnboundedArrayStack.java` | An array stack that grows and shrinks dynamically | O(1) amortized | O(1) amortized |
| 4 | `StackQueueEnqueueFriendly.java` | A queue built from two stacks, optimised for fast enqueueing | O(1) ⚡ | O(n) 🐢 |

### 📌 Submission 2 — Queues & Linked Lists

| # | File | The Idea | Insert / Enqueue | Delete / Dequeue |
|---|---|---|---|---|
| 5 | `StackQueue.java` | A queue built from two stacks, optimised for fast dequeuing | O(n) 🐢 | O(1) ⚡ |
| 6 | `ArrayCircularQueue.java` | A circular queue implemented using an array | O(1) ⚡ | O(1) ⚡ |
| 7 | `SinglyLinkedList.java` | A linked list where each node points to the next node | O(1)* | O(n) |
| 8 | `DoublyLinkedList.java` | A linked list where each node points both forward and backward | O(1)* | O(n) |

*For linked lists, insertion at the beginning is O(1). Insertion at the end in the singly linked list is O(n) in this implementation.*

---

## 🎭 The Stories Behind Each File

### 📌 Submission 1 — Stacks & Queues

#### 1️⃣ QueueStack — Push Friendly

Pushing is effortless: just join the line. Popping is the hard part. To reach the last person in the queue, everyone else steps into a second queue first, then the last one leaves.

#### 2️⃣ QueueStack — Pop Friendly

The mirror image. Every new element does the hard work upfront by rotating itself to the front of the line. The reward? Popping is a simple "next, please!"

#### 3️⃣ Unbounded Array Stack

The stack with a shape-shifting backpack 🎒

- **Full?** Capacity doubles.
- **Only a quarter full?** Capacity halves.
- It never shrinks below the starting capacity.

No overflow, no wasted space, and it resizes during both push and pop.

#### 4️⃣ StackQueue — Enqueue Friendly

Two stacks, one queue. Enqueueing is a single push. Dequeuing requires transferring elements between stacks to access the front item.

---

### 📌 Submission 2 — Queues & Linked Lists

#### 5️⃣ StackQueue — Dequeue Friendly

This implementation uses two stacks to create a queue that makes dequeuing super fast.

- **Enqueue:** Elements are inserted in the correct order by transferring existing elements.
- **Dequeue:** Simply removes the top element.
- **Main advantage:** Dequeue takes O(1) time.

#### 6️⃣ ArrayCircularQueue

A circular queue that makes efficient use of array space 🔄

- Uses `front` and `rear` pointers to manage elements.
- When the rear reaches the end of the array, it wraps around to the beginning.
- Prevents unnecessary shifting of elements.
- Both enqueue and dequeue operations take O(1) time.

#### 7️⃣ SinglyLinkedList

A simple chain of nodes where each node knows only the next node.

- Each node stores data and a reference to the next node.
- Supports insertion at the beginning and end.
- Supports searching and deleting elements.
- Uses dynamic memory allocation.

#### 8️⃣ DoublyLinkedList

A more flexible linked list that can move in both directions ↔️

- Each node stores data, a previous reference, and a next reference.
- Supports insertion at both the beginning and end.
- Supports deletion and searching.
- Allows forward and backward traversal.

---

## 🚀 Run It Yourself

You need the **JDK** installed.

Every Java file has its own `main` method with a mini demonstration.

### Compile a Java file

```bash
javac StackQueue.java
```

### Run the program

```bash
java StackQueue
```

You can replace `StackQueue` with any Java filename from the tables above.

To compile all Java files together:

```bash
javac *.java
```

---

## 🧠 Key Takeaways

- **Trade-offs are everything.** You can optimise enqueueing or dequeuing depending on the implementation.
- **Amortized thinking pays off.** Dynamic arrays can grow and shrink efficiently.
- **LIFO and FIFO are two sides of one coin.** Stacks and queues can be implemented using each other.
- **Circular queues save space.** They reuse empty positions in an array.
- **Linked lists are flexible.** They allow dynamic memory allocation without requiring a fixed size.
- **Pointers matter.** Singly and doubly linked lists use references to connect nodes.

---

## 🗂️ Repository Structure

```text
DSA/
│
├── QueueStackPushFriendly.java
├── QueueStackPopFriendly.java
├── UnboundedArrayStack.java
├── StackQueueEnqueueFriendly.java
│
├── StackQueue.java
├── ArrayCircularQueue.java
├── SinglyLinkedList.java
├── DoublyLinkedList.java
│
└── README.md
```

---

## 👋 About

Made with ☕ and a lot of `push()`, `pop()`, `enqueue()`, `dequeue()`, and linked nodes as part of my **Data Structures & Algorithms coursework**.

⭐ If this helped you understand data structures a little better, feel free to star the repo!
