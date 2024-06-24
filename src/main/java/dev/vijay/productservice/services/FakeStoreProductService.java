package dev.vijay.productservice.services;

import dev.vijay.productservice.models.Products;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("fakestore")
public class FakeStoreProductService implements  ProductService{
    @Override
    public Products getSingleProduct(int id) {

        return null;
    }

    @Override
    public List<Products> getAllProducts() {
        return List.of();
    }

    @Override
    public Products createProduct(int id, int price, String name, String description, Products products) {
        return null;
    }
}
