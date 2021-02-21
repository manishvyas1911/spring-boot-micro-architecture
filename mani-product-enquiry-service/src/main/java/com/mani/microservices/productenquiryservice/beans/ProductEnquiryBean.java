package com.mani.microservices.productenquiryservice.beans;

import java.math.BigDecimal;

public class ProductEnquiryBean {

	private Long id; 
	private String name;
	private BigDecimal price;
	private String availability;
	private double discount;
	private double discountPrice;

	private int unit;
	private double totalPrice;
	
	private int port;

	public ProductEnquiryBean(Long id, String name, BigDecimal price, String availability, double discount, int unit,
			double totalPrice, int port) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.availability = availability;
		this.discount = discount;
		this.unit = unit;
		this.totalPrice = totalPrice;
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

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	

	public double getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}

	@Override
	public String toString() {
		return "ProductEnquiryBean [id=" + id + ", name=" + name + ", price=" + price + ", availability=" + availability
				+ ", discount=" + discount + ", discountPrice=" + discountPrice + ", unit=" + unit + ", totalPrice="
				+ totalPrice + ", port=" + port + "]";
	}

	
	
	
	
	
	
}
