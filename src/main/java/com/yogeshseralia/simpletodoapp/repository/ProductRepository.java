package com.yogeshseralia.simpletodoapp.repository;

import com.yogeshseralia.simpletodoapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
