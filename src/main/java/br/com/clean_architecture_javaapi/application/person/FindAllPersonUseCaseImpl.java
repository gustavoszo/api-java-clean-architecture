package br.com.clean_architecture_javaapi.application.person;

import java.util.List;

import br.com.clean_architecture_javaapi.adapters.PersonGateway;
import br.com.clean_architecture_javaapi.core.entities.Person;
import br.com.clean_architecture_javaapi.core.usecases.person.FindAllPersonUseCase;

public class FindAllPersonUseCaseImpl implements FindAllPersonUseCase {

    private PersonGateway personGateway;

    public FindAllPersonUseCaseImpl(PersonGateway personGateway) {
        this.personGateway = personGateway;
    }

    @Override
    public List<Person> execute() {
        return personGateway.findAll();
    }

}
