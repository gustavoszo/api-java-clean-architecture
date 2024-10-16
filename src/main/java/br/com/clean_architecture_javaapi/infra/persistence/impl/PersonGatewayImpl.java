package br.com.clean_architecture_javaapi.infra.persistence.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.clean_architecture_javaapi.adapters.PersonGateway;
import br.com.clean_architecture_javaapi.core.entities.Person;
import br.com.clean_architecture_javaapi.infra.persistence.entities.PersonEntity;
import br.com.clean_architecture_javaapi.infra.persistence.mapper.PersonEntityMapper;
import br.com.clean_architecture_javaapi.infra.persistence.repositories.PersonEntityRepository;

@Component
public class PersonGatewayImpl implements PersonGateway {

    @Autowired
    PersonEntityRepository personEntityRepository;

    @Override
    public Person create(Person person) {
        PersonEntity personEntity = PersonEntityMapper.toEntity(person);
        personEntityRepository.save(personEntity);
        return PersonEntityMapper.toPerson(personEntity);
    }

    @Override
    public Person findByCpfCnpj(String cpfCpnj) {
        PersonEntity personEntity = personEntityRepository.findByCpfCnpj(cpfCpnj);
        if (personEntity == null) return null;
        return PersonEntityMapper.toPerson(personEntity);
    }

    @Override
    public List<Person> findAll() {
        List<PersonEntity> personEntityList = personEntityRepository.findAll();
        return PersonEntityMapper.toPersonList(personEntityList);
    }
    
}
