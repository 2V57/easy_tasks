package java_core_1.task_4.service;

import java_core_1.task_4.entity.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HobbyFinder {
    public static Map<User, String> findHobbyLovers(List<User> users, Set<String> hobbies) {
        Map<User, String> result = new HashMap<>();

        for (User user : users) {
            for (String activity : user.getHobbies()) {
                if (hobbies.contains(activity)) {
                    result.put(user, activity);
                    break;
                }
            }
        }
        return result;
    }

    public static void printMatchedHobbies(Map<User, String> users) {
        users.forEach((u, h) ->
                System.out.println(u.getName() + " -> " + h));
    }
}
