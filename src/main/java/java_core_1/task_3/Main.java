package java_core_1.task_3;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Conan");
        Archer archer = new Archer("Robin");

        while (!(warrior.getHealth() == 0) || !(archer.getHealth() == 0)){
            System.out.println("Before attack " + archer.getName() + " has " + archer.getHealth() + " HP.");
            warrior.attack(archer);
            System.out.println("After attack " + archer.getName() + " has " + archer.getHealth() + " HP.");

            System.out.println();

            System.out.println("Before attack " + warrior.getName() + " has " + warrior.getHealth() + " HP.");
            archer.attack(warrior);
            System.out.println("After attack " + warrior.getName() + " has " + warrior.getHealth() + " HP.");
        }
    }
}
