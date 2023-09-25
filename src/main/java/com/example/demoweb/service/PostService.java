package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private final List<Post> posts;

    public PostService() {
        posts = new ArrayList<>();
    }

    public List<Post> listAllPosts() {
        return this.posts;
    }

    public void create(String text) {
        this.posts.add(new Post((long) posts.size(), text, new Date()));
    }
}
