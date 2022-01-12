package com.microservices.productcatalogservice.service;

import com.microservices.productcatalogservice.entity.Product;
import com.microservices.productcatalogservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product findProductById(Long id) {
        return productRepository.findProductById(id);
    }

    public List<Product> findProductsByTitleContainingIgnoreCase(String title) {
        return productRepository.findProductsByTitleContainingIgnoreCase(title);
    }
}
