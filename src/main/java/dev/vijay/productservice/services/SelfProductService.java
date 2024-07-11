package dev.vijay.productservice.services;

import dev.vijay.productservice.models.Category;
import dev.vijay.productservice.models.Products;
import dev.vijay.productservice.repositories.CategoryRepository;
import dev.vijay.productservice.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("selfProductService")
public class SelfProductService implements ProductService {
    ProductRepository productRepository;
    CategoryRepository categoryRepository;
    public SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }
    @Override
    public Products getSingleProduct(long id) {
        return productRepository.findById(id);

    }

    @Override
    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Products createProduct(String title, int price, String description, String image, String category) {
        Products products = new Products();
        products.setTitle(title);
        products.setPrice(price);
        products.setDescription(description);
        products.setImageUrl(image);
        Category categoryFromDb = categoryRepository.findByTitle(category);
        if(categoryFromDb == null) {
           Category category1 = new Category();
           category1.setTitle(category);
           categoryFromDb = category1;

        }
        products.setCategory(categoryFromDb);
        Products savedProduct = productRepository.save(products);
        return savedProduct ;
    }
}
