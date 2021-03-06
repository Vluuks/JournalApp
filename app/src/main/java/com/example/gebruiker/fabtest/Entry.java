package com.example.gebruiker.fabtest;

import java.io.Serializable;

/*
    Model class which represents the journal entry object.
*/

public class Entry implements Serializable {

    private String title, content, mood;
    private String timestamp;
    private int id, isFavourite;

    public Entry(String title, String content, String mood) {
        this.title = title;
        this.content = content;
        this.mood = mood;
    }

    public Entry(int id, String title, String content, String mood, String timestamp, int favourite) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.mood = mood;
        this.timestamp = timestamp;
        this.isFavourite = favourite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int isFavourite() {
        return isFavourite;
    }

    public void setFavourite(int favourite) {
        isFavourite = favourite;
    }
}