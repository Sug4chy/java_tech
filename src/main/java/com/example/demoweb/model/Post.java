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

    public void setLikes(int likes) {
        this.likes = likes;
    }

    private final Date creationDate;

    public Date getCreationDate() {
        return this.creationDate;
    }

    private final Long id;

    public Long getId() {
        return id;
    }

    public Post(Long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
    }
}
