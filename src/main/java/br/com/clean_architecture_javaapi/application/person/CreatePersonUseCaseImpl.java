package br.com.clean_architecture_javaapi.application.person;

import br.com.clean_architecture_javaapi.adapters.PersonGateway;
import br.com.clean_architecture_javaapi.core.entities.Person;
import br.com.clean_architecture_javaapi.core.exceptions.BusinessException;
import br.com.clean_architecture_javaapi.core.usecases.person.CreatePersonUseCase;

public class CreatePersonUseCaseImpl implements CreatePersonUseCase {

    private final PersonGateway personGateway;

    public CreatePersonUseCaseImpl(PersonGateway personGateway) {
        this.personGateway = personGateway;
    }

    @Override
    public Person execute(Person person) {
        Person existsPerson = personGateway.findByCpfCnpj(person.getCpfCnpj());
        if (existsPerson != null) {
            throw new BusinessException(String.format("Person with CpfCnpj %s already exists", person.getCpfCnpj()));
        }
        return personGateway.create(person);
    }
}
