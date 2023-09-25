package com.example.demoweb.model;

public class Post {
    private String text;

    public String getText(){
        return this.text;
    }
    private int likes;

    public int getLikes() {
        return this.likes;
    }

    public Post(String text) {
        this.text = text;
    }
}
