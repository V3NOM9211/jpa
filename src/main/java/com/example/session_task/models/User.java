package com.example.session_task.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [id=" + userId + ", name=" + name + "]";
    }

}
