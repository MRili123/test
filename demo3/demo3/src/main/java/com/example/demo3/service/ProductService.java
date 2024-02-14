package com.example.demo3.service;

import com.example.demo3.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getallProducts();
    Product saveProduct (Product product);
    Product getProductById(long id);
    Product updateProduct (Product product);
    void deletProductById(long id );
}
