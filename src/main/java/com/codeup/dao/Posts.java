package com.codeup.dao;


import com.codeup.models.Post;

import java.util.List;

public interface Posts {
    List<Post> getAllPosts();
    void savePost(Post post);
}
