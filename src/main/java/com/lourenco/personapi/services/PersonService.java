package com.lourenco.personapi.services;

import com.lourenco.personapi.dto.PersonInput;
import com.lourenco.personapi.dto.PersonOutput;

public interface PersonService {

    PersonOutput create(PersonInput personInput) throws Exception;

}
