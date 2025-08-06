package java_core_1.task_2.entity;

import java_core_1.task_2.constant.UserConstant;


public record User(String name, int age, String job, String address) {

    public User {
        validateName(name);
        validateAge(age);
        validateJob(job);
        validateAddress(address);
    }

    private void validateName(String name){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Name cannot be empty or null.");
        }
    }

    private void validateAge(int age){
        if (age < UserConstant.USER_AGE){
            throw new IllegalArgumentException("User must be at least 18 years old!");
        }
    }

    private void validateJob(String job){
        if (!UserConstant.VALID_JOBS.contains(job)){
            throw new IllegalArgumentException("Invalid job: " + job + ". Valid options: " + UserConstant.VALID_JOBS);
        }
    }

    private void validateAddress(String address){
        if (!UserConstant.VALID_ADDRESSES.contains(address)){
            throw new IllegalArgumentException("Invalid address: " + address + ". Valid option: " + UserConstant.VALID_ADDRESSES);
        }
    }
}
