package dev.vijay.productservice.services;

import dev.vijay.productservice.dtos.FakeStoreProductdto;
import dev.vijay.productservice.models.Products;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service("fakestore")
public class FakeStoreProductService implements  ProductService{

    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
    @Override
    public Products getSingleProduct(long id) {

        FakeStoreProductdto fakeStoreProductdtoresponse = restTemplate.getForObject(
                "https://fakestoreapi.com/products/"+id,
                     FakeStoreProductdto.class);
        return fakeStoreProductdtoresponse.toProduct();
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
