# Java Data Structures

This repository contains implementations of fundamental **data structures** in Java.  
Each data structure is built from scratch without relying on built-in Java collections, making this repo a practical resource for understanding how these structures work internally.

---

## 📂 Project Structure
```
Java.Projects/
│
├── list_1/
│   └── src/
│       └── List.java
│
└── (more to come...)
```

---

## 📌 Implemented Data Structures

### 1. List
A custom dynamic array implementation similar to Java's `ArrayList`.

**Features:**
- Dynamic resizing when capacity is reached  
- Add elements at the end of the list  
- Get and set elements by index  
- Remove elements by index (with automatic shifting)  
- Check if empty or full  
- Clear all elements  
- Custom `toString` method for easy printing  

**Example Usage:**
```java
List<Integer> numbers = new List<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);

System.out.println(numbers);   // [10, 20, 30]
```

---

## 🎯 Learning Goals
This repository is designed to:
- Build a **strong foundation in data structures** using Java.  
- Provide **educational, minimal implementations** that are easy to read and extend.  
- Help learners understand **how built-in data structures (like ArrayList, LinkedList, etc.) work under the hood**.  

---

## 📌 Upcoming Implementations
- Later Added

---

💡 *Contributions and improvements are welcome!*
