package dev.vijay.productservice;

import dev.vijay.productservice.models.Products;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication {

    Products products = new Products();
    products.g
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

}
