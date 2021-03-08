package com.lourenco.personapi.mapper;


import com.lourenco.personapi.dto.PersonInput;
import com.lourenco.personapi.dto.PersonOutput;
import com.lourenco.personapi.entity.Person;

public class PersonMapper {

    public static Person to(PersonInput personInput) {
        final var person = new Person();
        person.setName(personInput.getName());
        person.setCpf(personInput.getCpf());
        person.setLastName(personInput.getLastName());
        person.setBirthDate(personInput.getBirthDate());
        return person;
    }

    public static PersonOutput toPersonOutput(Person person) {
        final var personOutput = new PersonOutput();
        personOutput.setId(person.getId());
        personOutput.setName(person.getName());
        personOutput.setName(person.getName());
        personOutput.setCpf(person.getCpf());
        personOutput.setBirthDate(person.getBirthDate());
        return personOutput;
    }
}