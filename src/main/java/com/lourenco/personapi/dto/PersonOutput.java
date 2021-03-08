package com.lourenco.personapi.dto;

import com.lourenco.personapi.entity.Phone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonOutput {

    private Long id;

    private String name;

    private String lastName;

    private String cpf;

    private LocalDate birthDate;

    private List<Phone> phones;
}
