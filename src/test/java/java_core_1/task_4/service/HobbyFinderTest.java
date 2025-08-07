package java_core_1.task_4.service;

import java_core_1.task_4.entity.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class HobbyFinderTest {

    @Test
    @DisplayName("Test find hobby lovers returns correct matches!")
    void testFindHobbyLovers_returnsCorrectMatches() {
        User user = new User(1, "Alice", 25, Set.of("football", "reading", "cooking"));
        User user1 = new User(2, "Bob", 30, Set.of("gaming"));
        User user2 = new User(3, "Clara", 28, Set.of("dancing", "cooking"));

        List<User> users = List.of(user, user1, user2);
        Set<String> hobbies = Set.of("reading", "cooking", "dancing");

        Map<User, String> result = HobbyFinder.findHobbyLovers(users, hobbies);

        assertEquals(2, result.size());
        assertTrue(hobbies.contains(result.get(user)));
        assertTrue(hobbies.contains(result.get(user2)));
        assertFalse(result.containsKey(user1));
    }

    @Test
    @DisplayName("Test find hobby lovers returns empty map when no matches")
    void testFindHobbyLovers_returnsEmptyMapWhenNoMatches() {
        User user = new User(1, "Dave", 40, Set.of("football", "gaming"));
        List<User> users = List.of(user);
        Set<String> hobbiesToMatches = Set.of("reading", "drawing");

        Map<User, String> result = HobbyFinder.findHobbyLovers(users, hobbiesToMatches);

        assertTrue(result.isEmpty());
    }

    @Test
    @DisplayName("Test find hobby lovers first match only")
    void testFindHobbyLovers_firstMatchOnly() {
        User user = new User(1, "Eva", 22, Set.of("dancing", "reading", "cooking"));
        Set<String> hobbiesToMatch = Set.of("reading", "dancing", "cooking");

        Map<User, String> result = HobbyFinder.findHobbyLovers(List.of(user), hobbiesToMatch);

        assertTrue(hobbiesToMatch.contains(result.get(user)));
    }
}