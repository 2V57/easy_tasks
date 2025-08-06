package java_core_1.task_1.service;

import java_core_1.task_1.entity.User;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserGroupService {
    public static Map<Integer, List<User>> groupUsers(List<User> users){
        if (users == null || users.isEmpty()){
            return Collections.emptyMap();
        }
        return users.stream().collect(Collectors.groupingBy(User::getAge));
    }

    public static void showGroupUsers(Map<Integer, List<User>> listMap){
        listMap.forEach((age, usersPerAge) ->{
            System.out.println("Age: " + age);
            for (User user1: usersPerAge){
                System.out.println(" - " + user1);
            }
        });
    }
}
