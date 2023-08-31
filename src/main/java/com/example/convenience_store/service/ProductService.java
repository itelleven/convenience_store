package com.example.convenience_store.service;

import com.example.convenience_store.model.entity.Product;
import com.example.convenience_store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Product findProductByName(String name) {
        return productRepository.findByName(name);
    }
}