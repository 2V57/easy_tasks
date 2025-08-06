📘 Task Description
At the company "Future World", a new platform has been developed to manage user data.
You are tasked with creating a module that ensures the correct creation of user objects, with strict input validation rules.
This will help prevent data processing errors and maintain data integrity.

🎯 Goal
Create a User class with a constructor that validates input data based on predefined rules.
The program should demonstrate the use of:
Static constants
Sets (Set)
Conditional checks
Exception handling

✅ Requirements
1️⃣ Create a User class representing a user with the following fields:
name — the user's name
age — the user's age
job — the user's workplace
address — the user's address

2️⃣ Declare and initialize static constants:
VALID_JOBS — a set of valid workplaces: "Google", "Uber", "Amazon"
VALID_ADDRESSES — a set of valid addresses: "London", "New York", "Amsterdam"

3️⃣ Create a constructor in the User class that:
Accepts values for all fields
Performs input validation:
Name must not be empty or null
Age must be at least 18
Job must be included in VALID_JOBS
Address must be included in VALID_ADDRESSES

4️⃣ If any of the conditions fail, the constructor must throw an IllegalArgumentException with an appropriate error message.

5️⃣ If all conditions pass, the constructor must assign the values to the corresponding fields.