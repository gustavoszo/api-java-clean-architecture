package br.com.clean_architecture_javaapi.core.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Person {

    private Long id;
    private String name;
    private String email;
    private String cpfCnpj;
    private PersonType type;

    public enum PersonType {
        FISICA, JURIDICA
    }

}
