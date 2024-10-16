package br.com.clean_architecture_javaapi.infra.controllers.dto;

import br.com.clean_architecture_javaapi.core.entities.Person;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class PersonCreateDto {

    private String name;
    private String email;
    private String cpfCnpj;
    private Person.PersonType type;

}
