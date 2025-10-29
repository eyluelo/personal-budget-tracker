package com.budgettracker.model;

import java.time.LocalDate;

public class User {
    private String username;
    private String password;
    final private LocalDate createdAt;

    public User(String username, String password, LocalDate createdAt){
        this.username= username;
        this.password=password;
        this.createdAt=createdAt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

}
