package dev.vijay.productservice.controllers;


import dev.vijay.productservice.models.Products;
import dev.vijay.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    /*
    POST /products/
    {
        "id":
        "title":
        "description":
        "price":
     }


     */
    private ProductService productService;

    public ProductController(@Qualifier("fakestore") ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/products")
    public void createProduct() {

    }



    @GetMapping("/product/{id}")
    public Products getProductsById(@PathVariable long id) {
        return  productService.getSingleProduct(id);

    }

    public void getAllProducts() {

    }

    public void updateProduct() {

    }

    public void deleteProduct() {

    }


}
