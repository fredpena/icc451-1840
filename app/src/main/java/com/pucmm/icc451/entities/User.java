package com.pucmm.icc451.entities;

import java.util.ArrayList;
import java.util.List;

public class User {

    private final String name;
    private final String hometown;

    public User(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
    }

    //retrieve user's name
    public String getName(){
        return name;
    }

    //retrieve users' hometown
    public String getHometown(){
        return hometown;
    }

    public static List<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Harry", "San Diego"));
        users.add(new User("Marla", "San Francisco"));
        users.add(new User("Sarah", "San Marco"));
        users.add(new User("Harry", "San Diego"));
        users.add(new User("Marla", "San Francisco"));
        users.add(new User("Sarah", "San Marco"));
        users.add(new User("Harry", "San Diego"));
        users.add(new User("Marla", "San Francisco"));
        users.add(new User("Sarah", "San Marco"));
        users.add(new User("Harry", "San Diego"));
        users.add(new User("Marla", "San Francisco"));
        users.add(new User("Sarah", "San Marco"));
        users.add(new User("Harry", "San Diego"));
        users.add(new User("Marla", "San Francisco"));
        users.add(new User("Sarah", "San Marco"));
        users.add(new User("Harry", "San Diego"));
        users.add(new User("Marla", "San Francisco"));
        users.add(new User("Sarah", "San Marco"));
        users.add(new User("Harry", "San Diego"));
        users.add(new User("Marla", "San Francisco"));
        users.add(new User("Sarah", "San Marco"));
        users.add(new User("Harry", "San Diego"));
        users.add(new User("Marla", "San Francisco"));
        users.add(new User("Sarah", "San Marco"));
        return users;
    }

}
