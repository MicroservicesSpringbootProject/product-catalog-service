package com.microservices.productcatalogservice.controller;

import com.microservices.productcatalogservice.entity.Product;
import com.microservices.productcatalogservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping("/{productId}")
    public Product findProductById(@PathVariable("productId") Long id) {
        return productService.findProductById(id);
    }

    @GetMapping("/{name}")
    public List<Product> findProductByTitle(@PathVariable("name") String title) {
        List<Product> products = productService.findProductsByTitleContainingIgnoreCase(title);
        return products;
    }
}
