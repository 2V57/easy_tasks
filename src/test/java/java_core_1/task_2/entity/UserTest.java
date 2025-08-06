package java_core_1.task_2.entity;

import java_core_1.task_2.constant.UserConstant;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("A user is successfully created with valid data!")
    void testValidUserCreation() {
        User user = new User("Vitalijus", 36, "Uber", "London");
        assertEquals("Vitalijus", user.name());
        assertEquals(36, user.age());
        assertEquals("Uber", user.job());
        assertEquals("London", user.address());
    }

    @Test
    @DisplayName("An error is raised if the name field is empty!")
    void testEmptyName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new User(" ", 36, "Uber", "London")
        );
        assertTrue(exception.getMessage().contains("Name cannot be empty or null."));
    }

    @Test
    @DisplayName("An error is raised if the name field is null!")
    void testNullName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new User(null, 36, "Uber", "London")
        );
        assertTrue(exception.getMessage().contains("Name cannot be empty or null."));
    }

    @Test
    @DisplayName("An error is raised if the user's age is below 18!")
    void testInvalidAge() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new User("Vitalijus", 16, "Uber", "London")
        );
        assertTrue(exception.getMessage().contains("User must be at least 18 years old!"));
    }

    @Test
    @DisplayName("An error is raised if the job does not match a valid option.")
    void tetInvalidJob() {
        String invalidJob = "VP";
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new User("Vitalijus", 20, invalidJob, "London")
        );
        assertTrue(exception.getMessage().contains("Invalid job: " + invalidJob + ". Valid options: " + UserConstant.VALID_JOBS));
    }
    
    @Test
    @DisplayName("An error is raised if the address format is incorrect.")
    void testInvalidAddress(){
        String invalidAddress = "Vilnius";
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                        new User("Vitalijus", 26, "Uber", invalidAddress)
                );
        assertTrue(exception.getMessage().contains("Invalid address: " + invalidAddress + ". Valid option: " + UserConstant.VALID_ADDRESSES));
    }
}