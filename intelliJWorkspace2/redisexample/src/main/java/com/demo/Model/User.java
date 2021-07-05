package com.demo.Model;


import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {


    private Long id;
    private String name;
    private String lastName;
    private String emailId;
    private int age;

    public User() {
    }

    public User(Long id, String name, String lastName, String emailId, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.emailId = emailId;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", age=" + age +
                '}';
    }
}
