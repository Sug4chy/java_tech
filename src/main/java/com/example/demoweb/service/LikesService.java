package com.example.demoweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikesService {
    private final PostService postService;

    @Autowired
    public LikesService(PostService postService) {
        this.postService = postService;
    }

    public int like(Long id) {
        var post = postService.listAllPosts().get(id.intValue());
        post.setLikes(post.getLikes() + 1);
        return post.getLikes();
    }
}
