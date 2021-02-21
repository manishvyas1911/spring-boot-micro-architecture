package com.mani.microservices.productstockservice.beans;

import java.math.BigDecimal;

public class ProductStockBean {

	private Long id; 
	private String name;
	private BigDecimal price;
	private String availability;
	private double discount;
	
	private int port;

	public ProductStockBean(Long id, String name, BigDecimal price, String availability, double discount, int port) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.availability = availability;
		this.discount = discount;
		this.port = port;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	

	@Override
	public String toString() {
		return "ProductStock [id=" + id + ", name=" + name + ", price=" + price + ", availability=" + availability
				+ ", discount=" + discount + ", port=" + port + "]";
	}
	
	
	
}
