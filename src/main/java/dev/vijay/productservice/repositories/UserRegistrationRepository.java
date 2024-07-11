package dev.vijay.productservice.repositories;

import dev.vijay.productservice.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegistrationRepository extends JpaRepository<Person,Long> {

}
