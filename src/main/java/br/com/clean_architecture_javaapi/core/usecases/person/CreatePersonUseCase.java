package br.com.clean_architecture_javaapi.core.usecases.person;

import br.com.clean_architecture_javaapi.core.entities.Person;

public interface CreatePersonUseCase {

    public Person execute(Person person);

}
