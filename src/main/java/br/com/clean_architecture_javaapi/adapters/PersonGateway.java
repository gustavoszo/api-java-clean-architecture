package br.com.clean_architecture_javaapi.adapters;

import java.util.List;

import br.com.clean_architecture_javaapi.core.entities.Person;

public interface PersonGateway {

    public Person create(Person person);
    public Person findByCpfCnpj(String cpfCpnj);
    public List<Person> findAll();

}
