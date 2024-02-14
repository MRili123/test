package com.example.demo3.repository;
import  com.example.demo3.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepesitory extends JpaRepository<Product,Long> {


}
