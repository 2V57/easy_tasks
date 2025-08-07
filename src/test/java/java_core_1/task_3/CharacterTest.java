package java_core_1.task_3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

   @Test
   @DisplayName("Test warrior constructor values!")
   void testWarriorConstructorValues(){
       Character warrior = new Warrior("Conan");
       assertEquals("Conan", warrior.getName());
       assertEquals(10, warrior.getPower());
       assertEquals(5, warrior.getDexterity());
       assertEquals(3, warrior.getIntelligence());
       assertEquals(100, warrior.getHealth());
   }

    @Test
    @DisplayName("Test archer constructor values!")
    void testArcherConstructorValues(){
        Character archer = new Archer("Conan");
        assertEquals("Conan", archer.getName());
        assertEquals(3, archer.getPower());
        assertEquals(10, archer.getDexterity());
        assertEquals(5, archer.getIntelligence());
        assertEquals(100, archer.getHealth());
    }

    @Test
    @DisplayName("Test take too much damage!")
    void takeDamage() {
        Character warrior = new Warrior("Conan");
        warrior.takeDamage(150);
        assertEquals(0, warrior.getHealth());
    }

    @Test
    @DisplayName("Test negative damage throws exception!")
    void testNegativeDamageThrowsException(){
        Character warrior = new Warrior("Conan");
        assertThrows(IllegalArgumentException.class, () -> warrior.takeDamage(-10));
    }

    @Test
    @DisplayName("Test attack deals damage")
    void testAttackDealsDamage(){
        Character warriorAttacker = new Warrior("Conan");
        Character archerDefender = new Archer("Robin");

        warriorAttacker.attack(archerDefender);

        assertEquals(90, archerDefender.getHealth());
    }
}