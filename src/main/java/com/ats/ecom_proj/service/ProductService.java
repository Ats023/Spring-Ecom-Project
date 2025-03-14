package com.ats.ecom_proj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ats.ecom_proj.model.Product;
import com.ats.ecom_proj.repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int productId) {
        return repo.findById(productId).orElse(new Product());
    }

    public void addProduct(Product newProduct) {
        repo.save(newProduct);
    }

    public void updateProduct(int id, Product updatedProduct) {
        repo.save(updatedProduct);
    }

    public void deleteProduct(int productId) {
        repo.deleteById(productId);
    }

    public List<Product> getProductsbyKeyword(String keyword) {
        return repo.findProductByNameLike(keyword);
    }
    
}
