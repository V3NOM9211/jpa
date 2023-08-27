package com.example.session_task.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int friendId;

    private int firstUserId;

    private int secondUserId;

    public Friend() {
    }

    public Friend(int firstUserId, int secondUserId) {
        this.firstUserId = firstUserId;
        this.secondUserId = secondUserId;
    }

    public int getFirstUserId() {
        return firstUserId;
    }

    public void setFirstUserId(int firstUserId) {
        this.firstUserId = firstUserId;
    }

    public int getSecondUserId() {
        return secondUserId;
    }

    public void setSecondUserId(int secondUserId) {
        this.secondUserId = secondUserId;
    }

    @Override
    public String toString() {
        return "Friend [firstUserId=" + firstUserId + ", id=" + friendId + ", secondUserId=" + secondUserId + "]";
    }

}
