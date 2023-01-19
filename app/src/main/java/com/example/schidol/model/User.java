package com.example.schidol.model;

public class User {
    private String id, title, description;

    public User(){

    }

    public User(String title, String description){
        this.title = title;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setEmail(String description) {
        this.description = description;
    }
}