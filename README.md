# 🧩 Solved Task: Grouping Users by Age

This project contains a solution to the task **"Grouping users by age"** using Java.

---

## 📋 Task Description

You are developing an application for managing user data.  
The main goal is to implement functionality that groups users by their age.

---

## 🎯 Goal

Implement a program that:

- Groups users by age using `List` and `Map`
- Demonstrates the use of:
  - Classes
  - Static methods
  - Java collections
  - Grouping data based on a criterion

---

## ✅ Requirements

1. **Create a `User` class** with the following fields:
   - `name` — user's name
   - `age` — user's age
   - `workplace` — user's workplace
   - `address` — user's address

2. **Add a static method `groupUsers(List<User> users)`** to the `User` class:
   - Accepts a list of `User` objects
   - Returns a `Map<Integer, List<User>>`:
     - Key: user age
     - Value: list of users with that age

3. **In the `main()` method**:
   - Create a list of several `User` objects
   - Call `groupUsers(...)`
   - Print the result to the console

---

## 📦 Technologies Used

- Java 17+
- Maven
- JUnit 5

---

## ▶️ How to Run

```bash
# Compile and run the main class
mvn compile
mvn exec:java -Dexec.mainClass="your.package.Main"
