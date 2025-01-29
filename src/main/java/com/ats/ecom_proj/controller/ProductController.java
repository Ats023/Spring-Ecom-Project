package com.ats.ecom_proj.controller;

import com.ats.ecom_proj.model.Product;
import com.ats.ecom_proj.service.ProductService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable int productId) {
        return service.getProductById(productId);
    }
    
    @PostMapping("/products")
    public void addProduct(@RequestBody Product newProduct) {
        service.addProduct(newProduct);
    }
    
    @PatchMapping("/products/{productId}")
    public void updateProduct(@RequestBody Product updatedProduct, @PathVariable int id) {
        service.updateProduct(id,updatedProduct);
    }
    
}
