package br.com.clean_architecture_javaapi.core.usecases.person;

import java.util.List;

import br.com.clean_architecture_javaapi.core.entities.Person;

public interface FindAllPersonUseCase {

    public List<Person> execute();

}
