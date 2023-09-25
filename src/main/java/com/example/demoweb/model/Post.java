package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;

    public String getText(){
        return this.text;
    }
    private int likes;

    public int getLikes() {
        return this.likes;
    }

    private Date creationDate;

    public Date getCreationDate() {
        return this.creationDate;
    }

    public Post(String text, Date creationDate) {
        this.text = text;
        this.creationDate = creationDate;
    }
}
