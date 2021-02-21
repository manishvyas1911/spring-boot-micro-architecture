package com.mani.microservices.productstockservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mani.microservices.productstockservice.beans.ProductStockBean;
import com.mani.microservices.productstockservice.entity.ProductStock;
import com.mani.microservices.productstockservice.repository.ProductStockRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	Environment environment;

	@Autowired
	ProductStockRepository productStockRepository;

	@GetMapping("/product/{name}/availability/{availability}")
	public ProductStockBean getProductByNameAndAvail(
			@PathVariable(required = false, name = "name") String productName,
			@PathVariable(required = false, name = "availability") String availability) {
		
		Optional<ProductStock> opPro = productStockRepository.findByNameAndAvailability(productName,
				availability);

		if (opPro.isPresent()) {
			ProductStock pStock = opPro.get();
			ProductStockBean pBean = new ProductStockBean(pStock.getId(), pStock.getName(), pStock.getPrice(),
					pStock.getAvailability(), pStock.getDiscount(), 
					Integer.parseInt(environment.getProperty("local.server.port")));
			
			return pBean;
		} else {
			return null;
		}

	}
}
