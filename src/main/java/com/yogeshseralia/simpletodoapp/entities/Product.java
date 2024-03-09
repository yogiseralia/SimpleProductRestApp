package com.yogeshseralia.simpletodoapp.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    private String productName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double price;
    private String about;

    public Product() {
    }

    public Product(String productName, int id, double price, String about) {
        this.productName = productName;
        this.id = id;
        this.price = price;
        this.about = about;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
