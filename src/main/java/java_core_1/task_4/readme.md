🎯 Task Description
📌 Objective:
You are tasked with developing a method to analyze users' hobbies.
Each user has a unique identifier, a name, an age, and a set of activities they are interested in.
The goal is to create a mechanism that can identify users who enjoy specific hobbies and return them in a convenient format.

🛠️ Goal:
Create a Java method that takes a list of users and a set of target activities, then returns a Map, where:
the key is the user,
and the value is the first matched activity between the user's interests and the given set.
This allows for efficient analysis and matching of users' interests against a predefined list of hobbies.

✅ Requirements:
1️⃣ Create a User class with the following fields:
id (int)
name (String)
age (int)
a Set<String> of activities (e.g. hobbies/interests)

2️⃣ Create a method findHobbyLovers that:
takes a List<User> and a Set<String> of activities,
returns a Map<User, String>.

3️⃣ The method must:
go through the list of users,
check if the user's set of activities contains at least one element from the given set,
if a match is found, store this user as a key in the resulting map,
and set the first matched activity as the corresponding value.

🔍 Note: only the first matching activity between the sets should be returned for each user.