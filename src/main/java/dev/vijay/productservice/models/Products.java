package dev.vijay.productservice.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Products {

    private int id;

    private String name;

    private String description;

    private int price;

    private String imageUrl;

    private Category category;

}
