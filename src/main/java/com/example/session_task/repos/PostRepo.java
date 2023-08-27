package com.example.session_task.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.session_task.models.Post;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM post p JOIN friend f ON (p.user_id = f.first_user_id OR p.user_id = f.second_user_id) WHERE (f.first_user_id =:userId OR f.second_user_id =:userId) AND p.user_id!=:userId ORDER BY p.post_id DESC")
    List<Post> getPostsByUserId(@Param("userId") int userId);

}