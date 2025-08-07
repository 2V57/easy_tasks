🛡️ RPG Character System – Task Description
📘 Task:
You are developing a basic module for an RPG game. In this game, characters possess various attributes that affect their combat abilities. The main goal is to implement a base class for characters and create subclasses for different types (Warrior and Archer), each with unique attack mechanics.

🎯 Objective:
Create a class hierarchy for game characters using inheritance and polymorphism. The task involves implementing an abstract class, subclasses with specific attributes, and interaction between characters through polymorphism.

✅ Requirements:
1️⃣ Create an abstract class Character with the following fields:
name (String)
strength (int)
dexterity (int)
intelligence (int)
health (int) – default value: 100 for all characters

2️⃣ Implement two constructors in the Character class:
One that accepts only the name and assigns default values to other attributes:
strength = 5, dexterity = 5, intelligence = 5.
This makes it a balanced starter character.
Another constructor that accepts all parameters except health (which remains at the default value of 100).

3️⃣ Create two subclasses of Character: Warrior and Archer, and override their constructors:
Warrior:
strength = 10, dexterity = 5, intelligence = 3
Name is passed from outside
Archer:
strength = 3, dexterity = 10, intelligence = 5
Name is passed from outside

4️⃣ Make attack an abstract method in Character, which takes another character (Character opponent) as a parameter.

5️⃣ Override attack in subclasses:
Warrior deals damage equal to its strength value.
The opponent's health is reduced accordingly.
Archer deals damage equal to its dexterity value.
The opponent's health is reduced accordingly.
Important: Health cannot go below 0. This check should be implemented in a shared method in the base class (Character).

💡 Note:
To access the fields within the class hierarchy, appropriate access modifiers (protected or getters/setters) should be applied in the Character base class.