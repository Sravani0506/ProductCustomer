package com.example.Springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Springbootproject.entities.Product;

public interface Productrepository extends JpaRepository<Product,Long> {

}
