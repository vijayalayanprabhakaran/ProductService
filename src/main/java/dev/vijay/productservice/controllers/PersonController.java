package dev.vijay.productservice.controllers;

import dev.vijay.productservice.models.Person;
import dev.vijay.productservice.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/persons")
    public ResponseEntity<Person> userReg(@RequestBody Person person){

        return registrationService.userRegistration(person);


    }
}
