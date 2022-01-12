package com.microservices.productcatalogservice.repository;

import com.microservices.productcatalogservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long > {
    Product findProductById(Long id);

    List<Product> findProductsByTitleContainingIgnoreCase(String title);
}
