package dev.vijay.productservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestBodyProductDto {
    private String title;
    private String description;
    private int price;
    private String image;
    private String category;
}
