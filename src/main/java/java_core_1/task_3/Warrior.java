package java_core_1.task_3;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name, 10, 5, 3);
    }

    @Override
    public void attack(Character opponent) {
        int damage = this.getPower();
        opponent.takeDamage(damage);
        System.out.println(this.getName() + " hits " + opponent.getName() + " for " + damage + " damage (strength-based).");
    }
}

