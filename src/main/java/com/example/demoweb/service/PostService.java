package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts() {
        return List.of(new Post("e>)"),
                new Post("Стёпа теперь джавист"),
                new Post("Пост №3"));
    }
}
