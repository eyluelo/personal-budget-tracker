package com.budgettracker.model;

import java.time.LocalDate;

public class Transaction {
    private final String id;
    private final String userId;
    private double amount;
    private Category category;
    private TransactionType type;
    private LocalDate date;
    private String description;

    public Transaction(String id, String userId, double amount, Category category, TransactionType type, LocalDate date, String description ){
        this.id = id;
        this.userId =userId ;
        this.amount = amount ;
        this.category = category ;
        this.type =type ;
        this.date = date;
        this.description =description ;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                '}';
    }
}

