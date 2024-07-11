package dev.vijay.productservice.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Products extends BaseModel {

    private String name;

    private String description;

    private double price;

    private String imageUrl;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Category category;

    private String title;


}
