package com.example.demoweb.controller;

import com.example.demoweb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostsViewController {
    private final PostService postService;

    @Autowired
    public PostsViewController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String list(Model model) {
        var posts = postService.listAllPosts();
        model.addAttribute("appName", "Сентябрь горит");
        model.addAttribute("posts", posts);
        return "list";
    }

    @ResponseBody
    @RequestMapping(path = "/post/{id}", method = RequestMethod.GET)
    public String single(@PathVariable("id") Long id) {
        return "Здесь будет страница поста №" + id;
    }
}
