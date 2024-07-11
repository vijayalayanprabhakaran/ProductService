package dev.vijay.productservice.repositories;

import dev.vijay.productservice.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {
    Products findByName(String name);
    Products findById(long id);
    Products save(Products products);

}
