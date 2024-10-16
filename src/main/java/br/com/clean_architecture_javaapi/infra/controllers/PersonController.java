package br.com.clean_architecture_javaapi.infra.controllers;

import br.com.clean_architecture_javaapi.core.entities.Person;
import br.com.clean_architecture_javaapi.core.usecases.person.CreatePersonUseCase;
import br.com.clean_architecture_javaapi.core.usecases.person.FindAllPersonUseCase;
import br.com.clean_architecture_javaapi.infra.controllers.dto.PersonResponseDto;
import br.com.clean_architecture_javaapi.infra.controllers.dto.PersonCreateDto;
import br.com.clean_architecture_javaapi.infra.controllers.mapper.PersonMapper;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/person")
public class PersonController {

    private final CreatePersonUseCase createPersonUseCase;
    private final FindAllPersonUseCase findAllPersonUseCase;

    @PostMapping
    public ResponseEntity<PersonResponseDto> create(@RequestBody PersonCreateDto personCreateDto) {
        Person person = createPersonUseCase.execute(PersonMapper.toPerson(personCreateDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(PersonMapper.toDto(person));
    }

    @GetMapping
    public ResponseEntity<List<PersonResponseDto>> findAll() {
        List<Person> people = findAllPersonUseCase.execute();
        return ResponseEntity.ok(PersonMapper.toDtoList(people));
    }

}
