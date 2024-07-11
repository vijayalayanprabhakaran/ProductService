package dev.vijay.productservice.controllers;


import dev.vijay.productservice.dtos.RequestBodyProductDto;
import dev.vijay.productservice.models.Products;
import dev.vijay.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    public ProductController(@Qualifier("selfProductService") ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/product")
    public Products createProduct(@RequestBody RequestBodyProductDto request) {
        return productService.createProduct(request.getTitle(),
                                                    request.getPrice(),
                request.getDescription(),request.getImage(),request.getCategory());

    }



    @GetMapping("/product/{id}")
    public Products getProductsById(@PathVariable long id) {
        return  productService.getSingleProduct(id);

    }

    @GetMapping("/product")
    public List<Products> getAllProducts() {
        return productService.getAllProducts();


    }

    public void updateProduct() {

    }

    public void deleteProduct() {

    }


}
