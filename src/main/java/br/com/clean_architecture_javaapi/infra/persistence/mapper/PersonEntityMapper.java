package br.com.clean_architecture_javaapi.infra.persistence.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import br.com.clean_architecture_javaapi.core.entities.Person;
import br.com.clean_architecture_javaapi.infra.persistence.entities.PersonEntity;

public class PersonEntityMapper {
    
    public static PersonEntity toEntity(Person person) {
        return new ModelMapper().map(person, PersonEntity.class);
    }

    public static Person toPerson(PersonEntity personEntity) {
        return new ModelMapper().map(personEntity, Person.class);
    }

    public static List<Person> toPersonList(List<PersonEntity> list) {
        return list.stream()
            .map(p -> toPerson(p))
            .collect(Collectors.toList());
    }
 
}
