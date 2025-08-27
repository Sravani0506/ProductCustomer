package com.example.Springbootproject.service;

import java.util.List;

import com.example.Springbootproject.entities.Product;

public interface Productservice {
String saveProduct(Product p);
List<Product> getAllProducts();
String updateProduct(Product product,Long pid);
String deleteProduct(Long pid);
Product getProductById(Long pid);
Product applyDiscountToProduct(Long pid,double discountpercentage);
}
