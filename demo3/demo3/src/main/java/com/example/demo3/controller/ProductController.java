package com.example.demo3.controller;

import com.example.demo3.entity.Product;
import com.example.demo3.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.model.IAttribute;

@Controller
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        super();
        this.productService = productService;
    }
    @GetMapping("/products")
    public String listProducts(Model model){
        model.addAttribute("products",productService.getallProducts());
        return "Products";
    }
    @GetMapping("products/new")
    public String createProductForm(Model model){
        Product product =new Product();
        model.addAttribute("product", product);
        return "create_product";
    }
    @PostMapping("/products")
    public String saveProduct(@ModelAttribute("product") Product product){
        productService.saveProduct(product);
        return "redirect:/products";
    }
    @GetMapping("/products/edit/{id}")
    public  String editProductForm(@PathVariable long  id , Model model){
        model.addAttribute("product",productService.getProductById(id));
  return "edit_product";
    }
    @PostMapping("/products/{id}")
    public  String updateProduct(@PathVariable long id , @ModelAttribute("product") Product product ,Model model){
      Product existingProduct = productService.getProductById(id);
      existingProduct.setId(id);
      existingProduct.setName(product.getName());
      existingProduct.setPrix(product.getPrix());
      productService.updateProduct(existingProduct);
      return "redirect:/products";

    }
    @GetMapping("/products/{id}")
    public String deletProduct(@PathVariable long  id ){
productService.deletProductById(id);
  return  "redirect:/products";
    }


}

