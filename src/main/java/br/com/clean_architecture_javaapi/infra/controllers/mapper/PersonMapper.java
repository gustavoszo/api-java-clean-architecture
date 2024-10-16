package br.com.clean_architecture_javaapi.infra.controllers.mapper;

import br.com.clean_architecture_javaapi.core.entities.Person;
import br.com.clean_architecture_javaapi.infra.controllers.dto.PersonCreateDto;
import br.com.clean_architecture_javaapi.infra.controllers.dto.PersonResponseDto;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

public class PersonMapper {

    public static Person toPerson(PersonCreateDto dto) {
        return new ModelMapper().map(dto, Person.class);
    }

    public static PersonResponseDto toDto(Person person) {
        return new ModelMapper().map(person, PersonResponseDto.class);
    }

     public static List<PersonResponseDto> toDtoList(List<Person> list) {
        return list.stream()
            .map(p -> toDto(p))
            .collect(Collectors.toList());
    }

}
