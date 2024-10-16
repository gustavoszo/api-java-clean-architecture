package br.com.clean_architecture_javaapi.infra.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.clean_architecture_javaapi.adapters.PersonGateway;
import br.com.clean_architecture_javaapi.application.person.CreatePersonUseCaseImpl;
import br.com.clean_architecture_javaapi.application.person.FindAllPersonUseCaseImpl;
import br.com.clean_architecture_javaapi.core.usecases.person.CreatePersonUseCase;
import br.com.clean_architecture_javaapi.core.usecases.person.FindAllPersonUseCase;

@Configuration
public class BeanConfiguration {
    
    @Bean
    public CreatePersonUseCase createPersonUseCase(PersonGateway personGateway) {
        return new CreatePersonUseCaseImpl(personGateway);
    }
    
    @Bean
    public FindAllPersonUseCase findAllPersonUseCase(PersonGateway personGateway) {
        return new FindAllPersonUseCaseImpl(personGateway);
    }

}
