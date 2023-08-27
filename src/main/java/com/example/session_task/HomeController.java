package com.example.session_task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.session_task.models.Post;
import com.example.session_task.repos.PostRepo;

@RestController
@RequestMapping(path = "api/v1")
public class HomeController {

    @Autowired
    private PostRepo postRepo;

    @GetMapping(path = "home")
    public String home() {
        return "Hello World";
    }

    @PostMapping(path = "feed")
    public ResponseEntity<List<Post>> feeds(@RequestParam("userId") int userId, @RequestParam(name = "page", defaultValue = "1") int page, @RequestParam(name = "limit", defaultValue = "10") int limit) {
        return ResponseEntity.ok(postRepo.getPostsByUserId(userId));
    }

}
