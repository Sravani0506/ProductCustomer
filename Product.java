package com.example.Springbootproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long pid;
	@Column
	private String pname;
	@Column
	private double cost;
	@Column
	private String pquality;
	@ManyToOne
	@JoinColumn(name="cid")
	@JsonIgnoreProperties("product")
	private Customer customer;
	public Product(Long pid, String pname, double cost, String pquality, Customer customer) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.cost = cost;
		this.pquality = pquality;
		this.customer = customer;
	}
	public Product() {
		
	}
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getPquality() {
		return pquality;
	}
	public void setPquality(String pquality) {
		this.pquality = pquality;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void applyDiscount(double percentage) {
		double discountAmount=cost*(percentage/100);
		cost=cost-discountAmount;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", cost=" + cost + ", pquality=" + pquality + "]";
	}
	

}
