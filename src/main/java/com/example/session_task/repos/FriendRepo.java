package com.example.session_task.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.session_task.models.Friend;

@Repository
public interface FriendRepo extends JpaRepository<Friend, Integer> {
}
