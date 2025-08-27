package com.example.Springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Springbootproject.entities.Customer;

public interface Customerrepository extends JpaRepository<Customer,Long>{

}
