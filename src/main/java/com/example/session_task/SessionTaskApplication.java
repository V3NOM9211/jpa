package com.example.session_task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.example.session_task.models.Friend;
import com.example.session_task.models.Post;
import com.example.session_task.models.User;
import com.example.session_task.repos.FriendRepo;
import com.example.session_task.repos.PostRepo;
import com.example.session_task.repos.UserRepo;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class SessionTaskApplication {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private PostRepo postRepo;

	@Autowired
	private FriendRepo friendRepo;

	public static void main(String[] args) {
		SpringApplication.run(SessionTaskApplication.class, args);
	}

	@Transactional
	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
		for (int i = 0; i < 5; i++) {
			userRepo.save(new User("User" + i));
		}

		friendRepo.save(new Friend(1, 2));
		friendRepo.save(new Friend(1, 3));
		friendRepo.save(new Friend(2, 3));
		friendRepo.save(new Friend(4, 1));
		friendRepo.save(new Friend(5, 3));

		for (int i = 0; i < 15; i++) {
			Post post = new Post();
			post.setName("Post" + i);
			post.setCreatedAt("2021-09-01");
			postRepo.save(post);
		}
	}

}
