package com.example.session_task.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int postId;

    private String name;

    @Column(nullable = true)
    private int userId;

    private String createdAt;

    public Post() {
    }

    public Post(String name, int userId, String createdAt) {
        this.name = name;
        this.userId = userId;
        this.createdAt = createdAt;
    }

    public int getUserId() {
        return userId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getName() {
        return name;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Post [createdAt=" + createdAt + ", id=" + postId + ", name=" + name + ", userId=" + userId + "]";
    }

}
