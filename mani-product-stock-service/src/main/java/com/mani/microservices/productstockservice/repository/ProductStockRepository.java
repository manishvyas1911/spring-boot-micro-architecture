package com.mani.microservices.productstockservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mani.microservices.productstockservice.entity.ProductStock;

public interface ProductStockRepository extends JpaRepository<ProductStock, Long>{

	Optional<ProductStock> findByNameAndAvailability(String name, String availability);
}
