package com.lourenco.personapi.repository;


import com.lourenco.personapi.entity.Person;

import java.util.Optional;

public abstract class PersonRepositoryImpl implements PersonRepository {

    @Override
    public Optional<Person> findByFirstName(String name) {
        return Optional.empty();
    }
}