package dev.vijay.productservice.repositories;

import dev.vijay.productservice.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findByName(String name);
    Category findById(long id);
    Category save(Category category);
    Category findByTitle(String title);
}
