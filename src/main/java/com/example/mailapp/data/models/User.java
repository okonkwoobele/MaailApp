package com.example.mailapp.data.models;

import java.util.List;

public class User {
    private String userName;
    private String email;
    private String passWord;
    private List<Mail> inbox;
    private List<Mail> sentBox;
    private List<Mail> trash;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public List<Mail> getInbox() {
        return inbox;
    }

    public void setInbox(List<Mail> inbox) {
        this.inbox = inbox;
    }

    public List<Mail> getSentBox() {
        return sentBox;
    }

    public void setSentBox(List<Mail> sentBox) {
        this.sentBox = sentBox;
    }

    public List<Mail> getTrash() {
        return trash;
    }

    public void setTrash(List<Mail> trash) {
        this.trash = trash;
    }

    public List<Mail> getOutBox() {
        return outBox;
    }

    public void setOutBox(List<Mail> outBox) {
        this.outBox = outBox;
    }

    private List<Mail> outBox;

}
