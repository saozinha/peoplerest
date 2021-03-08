package com.lourenco.personapi.controller;

import com.lourenco.personapi.dto.PersonInput;
import com.lourenco.personapi.dto.PersonOutput;
import com.lourenco.personapi.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/create")
    public PersonOutput create(@RequestBody final PersonInput personInput) throws Exception {
        return this.personService.create(personInput);
    }
}
