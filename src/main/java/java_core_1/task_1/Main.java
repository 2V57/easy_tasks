package java_core_1.task_1;

import java_core_1.task_1.entity.User;
import java_core_1.task_1.service.UserGroupService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User("Vitalijus", 36, "VP","Vilnius");
        User user2 = new User("Veronika", 36, "Home","Vilnius");
        User user3 = new User("Leonidas", 1, "Home","Vilnius");

        List<User> list = List.of(user, user2, user3);

        UserGroupService.showGroupUsers(UserGroupService.groupUsers(list));
    }
}
