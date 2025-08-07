package java_core_1.task_4.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Set;

@AllArgsConstructor
@Getter
public class User {
    private int id;
    private String name;
    private int age;
    private Set<String> hobbies;
}
