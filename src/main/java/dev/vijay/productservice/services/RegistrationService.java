package dev.vijay.productservice.services;

import dev.vijay.productservice.models.Person;
import org.springframework.http.ResponseEntity;

public interface RegistrationService {
    ResponseEntity<Person> userRegistration(Person person
    );

    int userRegistration();
}
