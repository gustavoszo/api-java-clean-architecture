package br.com.clean_architecture_javaapi.infra.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.clean_architecture_javaapi.infra.persistence.entities.PersonEntity;

public interface PersonEntityRepository extends JpaRepository<PersonEntity, Long> {

    PersonEntity findByCpfCnpj(String cpfCpnj);
    
}