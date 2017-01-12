package com.codeup.dao;


import com.codeup.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Posts extends CrudRepository<Post, Long> {

    List<Post> findAll();
    Post findById(int id);
//    void savePost(Post post);

//    List<Post> getAllPosts();
//    void savePost(Post post);
//    Post getPostById(int id);
//    void updatePost(Post post);
//    void deletePost(Post post);
}
