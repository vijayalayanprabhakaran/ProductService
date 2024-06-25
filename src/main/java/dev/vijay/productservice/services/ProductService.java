package dev.vijay.productservice.services;

import dev.vijay.productservice.models.Products;

import java.util.List;

public interface ProductService {

    Products getSingleProduct(long id);
    List<Products> getAllProducts();
    Products createProduct(int id , int price , String name, String description,Products products );
}
