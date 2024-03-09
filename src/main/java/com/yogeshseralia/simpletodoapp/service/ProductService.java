package com.yogeshseralia.simpletodoapp.service;

import com.yogeshseralia.simpletodoapp.entities.Product;

import java.util.List;

public interface ProductService {
    Product create(Product product);
    Product update(int productId, Product product);
    void delete(int productId);

    Product getById(int productId);

    List<Product> getAll();
}
