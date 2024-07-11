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
    public Products createProduct(String title, int price, String description, String image, String category) {
        FakeStoreProductdto fakeStoreProductdto = new FakeStoreProductdto();
        fakeStoreProductdto.setTitle(title);
        fakeStoreProductdto.setDescription(description);
        fakeStoreProductdto.setPrice(price);
        fakeStoreProductdto.setCategory(category);
        fakeStoreProductdto.setImage(image);

        FakeStoreProductdto fakeStoreProductdtoresponse = restTemplate.postForObject(
                "https://fakestoreapi.com/products/",fakeStoreProductdto,
                FakeStoreProductdto.class);
        return fakeStoreProductdtoresponse.toProduct();
    }


}
