package com.example.rozgarproject;

public class User {
    public String fullName,age,email,category;
    public User(){
        // default constructor
    }
    public User(String fullName,String age, String email,String category) {
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.category = category;
    }
}
