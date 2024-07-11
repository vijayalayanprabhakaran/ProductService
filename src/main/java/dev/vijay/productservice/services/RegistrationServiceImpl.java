package dev.vijay.productservice.services;

import dev.vijay.productservice.models.Person;
import dev.vijay.productservice.repositories.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements  RegistrationService{
    @Autowired
    private UserRegistrationRepository userRegistrationRepository;
    @Override
    public ResponseEntity<Person> userRegistration(Person person
    ) {
       Person savedPerson = userRegistrationRepository.save(person);
       return ResponseEntity.ok(savedPerson);

    }

    @Override
    public int userRegistration() {
        return 0;
    }
}
