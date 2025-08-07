package java_core_1.task_4;

import java_core_1.task_4.entity.User;
import java_core_1.task_4.service.HobbyFinder;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> hobbies = Set.of("reading", "cooking", "dancing");

        User user = new User(1, "Alice",25, Set.of("football", "reading", "cooking"));
        User user1 = new User(2, "Bob", 30, Set.of("gaming"));
        User user2 = new User(3, "Clara", 28, Set.of("dancing", "cooking"));

        List<User> users = List.of(user, user1, user2);

        HobbyFinder.printMatchedHobbies(HobbyFinder.findHobbyLovers(users, hobbies));
    }
}
