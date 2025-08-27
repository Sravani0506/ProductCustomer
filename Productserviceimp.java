package com.example.Springbootproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Springbootproject.entities.Product;
import com.example.Springbootproject.repository.Productrepository;
@Service
public class Productserviceimp implements Productservice{
@Autowired
private Productrepository productrepository;

	public Productserviceimp(Productrepository productrepository) {
	super();
	this.productrepository = productrepository;
}

	@Override
	public String saveProduct(Product p) {
		// TODO Auto-generated method stub
		productrepository.save(p);
		return "product inserted successfully";
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> li=productrepository.findAll();
		return li;
	}

	

	@Override
	public String deleteProduct(Long pid) {
		// TODO Auto-generated method stub
		productrepository.deleteById(pid);
		return "product deleted";
	}

	@Override
	public Product getProductById(Long pid) {
		// TODO Auto-generated method stub
		
		return productrepository.findById(pid).get();
	}

	@Override
	public Product applyDiscountToProduct(Long pid, double discountpercentage) {
		// TODO Auto-generated method stub
		Optional<Product> productoptional=productrepository.findById(pid);
		if(productoptional.isPresent()) {
		Product product=productoptional.get();
		product.applyDiscount(discountpercentage);
		return productrepository.save(product);
		}
		return null;
	}
	

	@Override
	public String updateProduct(Product product, Long pid) {
		// TODO Auto-generated method stub
		Product pdt=productrepository.findById(pid).get();
		pdt.setPname(product.getPname());
		pdt.setPquality(product.getPquality());
		productrepository.save(pdt);
		return "product updated";
	}

}
