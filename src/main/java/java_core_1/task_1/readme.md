📌 Task Description
You are developing an application for managing user data.
The main task is to implement functionality that groups users by their age.

🎯 Goal
Implement a program that groups users by age using List and Map.
The program should demonstrate the use of classes, collections, static methods, and the concept of data grouping based on a specific criterion.

✅ Task Requirements
1️⃣ Create a User class with the following fields:
    name — the user's name
    age — the user's age
    workplace — the user's workplace
    address — the user's address

2️⃣ Add a static method groupUsers(List<User> users) to the User class, which:
    Accepts a list of User objects
    Returns a Map<Integer, List<User>>, where:
    The key is the user's age
    The value is a list of all users from the original list with that age

3️⃣ Implement the main() method:
    Create a list containing several User objects
    Call the groupUsers method
    Display the result on the screen

