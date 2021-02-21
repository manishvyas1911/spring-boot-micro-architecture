package com.mani.microservices.productstockservice.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductStock {

	@Id
	private Long id;

	@Column(name = "product_name")
	private String name;

	@Column(name = "product_price")
	private BigDecimal price;

	@Column(name = "product_availability")
	private String availability;

	@Column(name = "product_discount")
	private double discount;

	public ProductStock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductStock(Long id, String name, BigDecimal price, String availability, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.availability = availability;
		this.discount = discount;
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

	@Override
	public String toString() {
		return "ProductStock [id=" + id + ", name=" + name + ", price=" + price + ", availability=" + availability
				+ ", discount=" + discount + "]";
	}

}
