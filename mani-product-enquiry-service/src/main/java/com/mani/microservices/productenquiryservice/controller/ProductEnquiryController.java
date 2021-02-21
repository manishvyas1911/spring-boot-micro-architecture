package com.mani.microservices.productenquiryservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mani.microservices.productenquiryservice.beans.ProductEnquiryBean;
import com.mani.microservices.productenquiryservice.client.ProductStockClient;

@RestController
public class ProductEnquiryController {

	@Autowired
	ProductStockClient productStockClient;
	
	@GetMapping("/product-enquiry/name/{name}/availablilty/{availability}/unit/{unit}")
	public ProductEnquiryBean getEnquiryOfProduct(
			@PathVariable String name, 
			@PathVariable String availability,
			@PathVariable int unit) {
		ProductEnquiryBean productEnquiryBean = productStockClient.getProductByNameAndAvail(name, availability);
		System.out.println(productEnquiryBean);
		
		double totalPrice =productEnquiryBean.getPrice().doubleValue() * unit;
		double discount = productEnquiryBean.getDiscount();
		double discountedPrice = totalPrice - (totalPrice*discount/100);
		
		productEnquiryBean.setTotalPrice(totalPrice);
		productEnquiryBean.setDiscount(discount);
		productEnquiryBean.setDiscountPrice(discountedPrice);
		productEnquiryBean.setUnit(unit);
		
		return productEnquiryBean ;
	}
}
