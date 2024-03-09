package com.yogeshseralia.simpletodoapp.service;

import com.yogeshseralia.simpletodoapp.entities.Product;
import com.yogeshseralia.simpletodoapp.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(int productId, Product product) {
        Product product1 = productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));
        product1.setProductName(product.getProductName());
        product1.setAbout(product.getAbout());
        product1.setPrice(product.getPrice());
        return productRepository.save(product1);
    }

    @Override
    public void delete(int productId) {
        Product product1 = productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));
        productRepository.delete(product1);
    }

    @Override
    public Product getById(int productId) {
        return productRepository.findById(productId).orElseThrow(()-> new RuntimeException("Product not found"));
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
