package com.example.getripmenew.dto;

public class Comment {
    private final long id;
    private final long userId;
    private final long replyTo;
    private final String name;
    private final String content;

    public Comment(long id, long userId, long replyTo, String name, String content) {
        this.id = id;
        this.userId = userId;
        this.replyTo = replyTo;
        this.name = name;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
    }

    public long getReplyTo() {
        return replyTo;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }
}