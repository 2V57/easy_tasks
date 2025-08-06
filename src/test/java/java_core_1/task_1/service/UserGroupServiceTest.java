package java_core_1.task_1.service;

import java_core_1.task_1.entity.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("UserGroupService.class test")
public class UserGroupServiceTest {
    private static List<User> userList;

    @BeforeAll
    static void setUp() {
        userList = List.of(
                new User("Vitalijus", 36, "VP", "Vilnius"),
                new User("Veronika", 36, "Home", "Vilnius"),
                new User("Leonidas", 1, "Home", "Vilnius")
        );
    }

    @DisplayName("Group users by age test!")
    @Test
    void testGroupUsersByAge() {
        Map<Integer, List<User>> result = UserGroupService.groupUsers(userList);

        assertEquals(2, result.size());
        assertTrue(result.containsKey(36));
        assertTrue(result.containsKey(1));

        List<User> usersAge36 = result.get(36);
        assertEquals(2, usersAge36.size());

        List<User> userAge1 = result.get(1);
        assertEquals(1, userAge1.size());
        assertEquals("Leonidas", userAge1.getFirst().getName());
    }

    @DisplayName("Group users with empty list!")
    @Test
    void testGroupUsersWithEmptyList() {
        Map<Integer, List<User>> result = UserGroupService.groupUsers(Collections.emptyList());
        assertTrue(result.isEmpty());
    }

    @DisplayName("Group users with null!")
    @Test
    void testGroupUsersWithNull() {
        Map<Integer, List<User>> result = UserGroupService.groupUsers(null);
        assertTrue(result.isEmpty());
    }

    @DisplayName("Show group users output test!")
    @Test
    void testShowGroupUsersOutput() {
        Map<Integer, List<User>> result = UserGroupService.groupUsers(userList);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        System.setOut(new PrintStream(outContent));

        UserGroupService.showGroupUsers(result);

        System.setOut(originalOut);

        String output = outContent.toString();

        assertTrue(output.contains("36"));
        assertTrue(output.contains("1"));
    }
}