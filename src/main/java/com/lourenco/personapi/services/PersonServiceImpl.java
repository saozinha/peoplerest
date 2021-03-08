package com.lourenco.personapi.services;

import com.lourenco.personapi.dto.PersonInput;
import com.lourenco.personapi.dto.PersonOutput;
import com.lourenco.personapi.mapper.PersonMapper;
import com.lourenco.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public PersonOutput create(PersonInput personInput) throws Exception {
        //validateCpfAlreadyExists(personInput.getCpf());
        final var person = PersonMapper.to(personInput);
        return PersonMapper.toPersonOutput(this.personRepository.save(person));
    }

}