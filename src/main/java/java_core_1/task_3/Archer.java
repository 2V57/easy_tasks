package java_core_1.task_3;

public class Archer extends Character{
    public Archer(String name) {
        super(name, 3, 10, 5);
    }
    @Override
    public void attack(Character opponent) {
        int damage = this.getDexterity();
        opponent.takeDamage(damage);
        System.out.println(this.getName() + " shoots " + opponent.getName() + " for " + damage + "damage (strength-based).");
    }
}
