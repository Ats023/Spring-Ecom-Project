package com.ats.ecom_proj.controller;

import com.ats.ecom_proj.model.Product;
import com.ats.ecom_proj.service.ProductService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
    public ResponseEntity<List<Product>> getProducts() {
        return new ResponseEntity<>(service.getProducts(), HttpStatus.OK);
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable int productId) {
        return new ResponseEntity<>(service.getProductById(productId), HttpStatus.OK);
    }
    
    @PostMapping("/products")
    public void addProduct(@RequestBody Product newProduct) {
        service.addProduct(newProduct);
    }
    
    @PatchMapping("/products/{productId}")
    public void updateProduct(@RequestBody Product updatedProduct, @PathVariable int id) {
        service.updateProduct(id,updatedProduct);
    }

    @DeleteMapping("/products/{productId}")
    public void deleteProduct(@PathVariable int productId) {
        service.deleteProduct(productId);
    }

    @GetMapping("/products/search")
    public ResponseEntity<List<Product>> getProductsbyKeyword(@RequestParam String keyword) {
        return new ResponseEntity<>(service.getProductsbyKeyword(keyword), HttpStatus.OK);
    }
    
    
}
