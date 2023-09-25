package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private final String text;

    public String getText(){
        return this.text;
    }
    private int likes;

    public int getLikes() {
        return this.likes;
    }

    private final Date creationDate;

    public Date getCreationDate() {
        return this.creationDate;
    }

    public Post(String text, Date creationDate) {
        this.text = text;
        this.creationDate = creationDate;
    }
}
