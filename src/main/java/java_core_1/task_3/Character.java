package java_core_1.task_3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Character {
    private static final int MIN_HEALTH = 0;
    private String name;
    private int power;
    private int dexterity;
    private int intelligence;
    private int health = 100;

    public abstract void attack(Character opponent);

    public Character(String name) {
        this.name = name;
        this.power = 5;
        this.dexterity = 5;
        this.intelligence = 5;
    }

    public Character(String name, int power, int dexterity, int intelligence) {
        this.name = name;
        this.power = power;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public void takeDamage(int damage){
        if (damage < MIN_HEALTH){
            throw new IllegalArgumentException("Damage cannot be negative.");
        }

        health -= damage;
        if (health < MIN_HEALTH){
            health = MIN_HEALTH;
        }
    }
}
