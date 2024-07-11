package com.exchangeagency.model;

import java.sql.Timestamp;

public class Item {
    private int id;
    private String name;
    private String category;
    private String brand;
    private String features;
    private String description;
    private String condition;
    private byte[] photo;
    private int userId;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    // Default constructor
    public Item() {
    }

    // Parameterized constructor
    public Item(int id, String category, String name, String brand, String features, String description, String condition, byte[] photo, int userId, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.brand = brand;
        this.features = features;
        this.description = description;
        this.condition = condition;
        this.photo = photo;
        this.userId = userId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFeatures () {
        return features ;
    }

    public void setFeatures (String features) {
        this.features  = features;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
