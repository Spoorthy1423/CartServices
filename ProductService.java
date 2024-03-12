package com.example.Product.Controler.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public String getAllProducts() {
        return "All Products";
    }
    public String getProductivitybyId(Long id) {
        return "Product from Service with id: ";
    }
}