package com.ecommerce.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
