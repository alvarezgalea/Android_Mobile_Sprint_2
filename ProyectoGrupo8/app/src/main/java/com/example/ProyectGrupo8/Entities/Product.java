package com.example.ProyectGrupo8.Entities;

public class Product {
    private int image;
    private String name;
    private String Description;
    private int price;

    public Product(int image, String name, String description, int price) {
        this.image = image;
        this.name = name;
        Description = description;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
