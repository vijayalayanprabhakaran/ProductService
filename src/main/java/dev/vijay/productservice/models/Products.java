package dev.vijay.productservice.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Products extends BaseModel {

    private String name;

    private String description;

    private double price;

    private String imageUrl;

    private Category category;

    private String title;


}
