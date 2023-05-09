package com.nttdata.patterndesign.patterns.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.nttdata.patterndesign.patterns.person.Person;

@Configurable
public class PersonConfiguration {
	
	
    @Bean("singletonPerson")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Person createSingletonPerson() {
        return new Person("Juan", 30);
    }

    @Bean("prototypePerson")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Person createPrototypePerson() {
        return new Person("Pedro", 25);
    }
	

}
