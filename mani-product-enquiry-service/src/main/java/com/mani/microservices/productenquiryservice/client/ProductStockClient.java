package com.mani.microservices.productenquiryservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mani.microservices.productenquiryservice.beans.ProductEnquiryBean;

// @FeignClient(name="product-stock-service",url = "localhost:8200")
 @FeignClient(name="product-stock-service") 

public interface ProductStockClient {
	
	@GetMapping("/products/product/{name}/availability/{availability}")
	public ProductEnquiryBean getProductByNameAndAvail(
			@PathVariable(required = false, name = "name") String productName,
			@PathVariable(required = false, name = "availability") String availability);
}
