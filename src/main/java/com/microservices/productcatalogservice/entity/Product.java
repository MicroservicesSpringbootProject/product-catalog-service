package com.microservices.productcatalogservice.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected String category;
    protected String description;
    protected BigDecimal price;
    protected Boolean availability;

    // Default constructor for JPA only
    protected Product() {
    }

    public Product(String title, String category, String description, BigDecimal price, Boolean availability) {
        this.title = title;
        this.category = category;
        this.description = description;
        this.price = price;
        this.availability = availability;
    }

    public Long getId() {
        return id;
    }

    protected void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    protected void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price.setScale(2, RoundingMode.HALF_EVEN);
    }

    protected void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getAvailability() {
        return availability;
    }

    protected void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return title + " [" + category + "]: $" + price;
    }
}
