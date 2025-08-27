package com.example.Springbootproject.service;

import java.util.List;

import com.example.Springbootproject.entities.Customer;

public interface Customerservice {
String saveCustomer(Customer c);
List<Customer> getAllCustomers();
Customer assignProductToCustomer(Long pid,Long cid);
}
