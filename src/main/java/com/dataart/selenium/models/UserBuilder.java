package com.dataart.selenium.models;

public class UserBuilder {
    public static User admin() {
        User user = new User("admin", "admin");
        user.setFname("Ivan");
        user.setLname("Petrov");
        return user;
    }

    public static User newuser() {
        User newuser = new User("test", "test");
        newuser.setFname("Test");
        newuser.setLname("Test");
        newuser.setRole ("DEVELOPER");
        return newuser;
    }
}
