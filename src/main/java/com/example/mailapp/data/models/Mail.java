package com.example.mailapp.data.models;

import java.time.LocalDateTime;

public class Mail {
    private String sender;
    private String receiver;
    private String subjectTitle;
    private String body;
    private static final LocalDateTime  timeCreated = LocalDateTime.now();
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubjectTitle() {
        return subjectTitle;
    }

    public void setSubjectTitle(String subjectTitle) {
        this.subjectTitle = subjectTitle;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

}
