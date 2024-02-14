package com.example.demo3.service.imp;

import com.example.demo3.entity.Product;
import com.example.demo3.repository.ProductRepesitory;
import com.example.demo3.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService {
    private ProductRepesitory productRepesitory;

    public ProductServiceImp(ProductRepesitory productRepesitory) {
        super();
        this.productRepesitory = productRepesitory;
    }

    @Override
    public List<Product> getallProducts() {
        return productRepesitory.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepesitory.save(product);
    }
    @Override
    public Product getProductById(long id) {
        return productRepesitory.findById( id).get();
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepesitory.save(product);
    }

    @Override
    public void deletProductById(long id) {
        productRepesitory.deleteById(id);

    }

}
