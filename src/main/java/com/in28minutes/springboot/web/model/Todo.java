package com.in28minutes.springboot.web.model;

import javax.validation.constraints.Size;
import java.util.Date;

public class Todo {

    private int id;
    private String user;
    @Size(min = 10, message = "Enter at least 10 characters!")
    private String description;
    private Date targetDate;
    private boolean completed;

    public Todo() {
    }

    public Todo(int id, String user, String description, Date targetDate, boolean completed) {
        this.id = id;
        this.user = user;
        this.description = description;
        this.targetDate = targetDate;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + targetDate +
                ", completed=" + completed +
                '}';
    }
}
