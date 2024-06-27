package dev.vijay.productservice.services;

import dev.vijay.productservice.models.Products;
import org.springframework.stereotype.Service;

import java.util.List;


public class OwnStoreProductService implements ProductService{
    @Override
    public Products getSingleProduct(long id) {
        return null;
    }

    @Override
    public List<Products> getAllProducts() {
        return List.of();
    }

    @Override
    public Products createProduct(String title, int price, String description, String image, String category) {
        return null;
    }


}
