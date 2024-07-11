package dev.vijay.productservice.dtos;

import dev.vijay.productservice.models.Category;
import dev.vijay.productservice.models.Products;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FakeStoreProductdto {

    private  long id ;
    private String title;
    private String image;
    private String description ;
    private String category;
    private double price;

    public Products toProduct(){
        Products product = new Products();
        product.setId(id);
        product.setTitle(title);
        product.setPrice(price);
        product.setDescription(description);
        product.setImageUrl(image);

        Category category1 = new Category();
        category1.setTitle(category);

        product.setCategory(category1);

        return product;
    }

}
