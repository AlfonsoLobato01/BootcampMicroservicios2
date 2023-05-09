package com.nttdata.patterndesign.patterns.tests;

import org.springframework.beans.factory.annotation.Autowired;

import com.nttdata.patterndesign.patterns.configuration.PersonConfiguration;
import com.nttdata.patterndesign.patterns.person.Person;

public class TestsMetodos {
	
	@Autowired
	private PersonConfiguration configPerson;
	
	
	void BuilderTest() {
		Person persona1 = Person.builder()
				.name("Pedro")
				.age(25)
				.build();
		System.out.println("Nombre : " + persona1.getName() + "\nEdad : " + persona1.getAge());
	}
	
	
	void singletonTest() {
		Person persona1 = configPerson.createSingletonPerson();
		Person persona2 = configPerson.createSingletonPerson();
		
		System.out.println("Persona 1 : \n" + "Nombre : " + persona1.getName() + ", Edad: " + persona1.getAge() );
		System.out.println("Persona 2 : \n" + "Nombre : " + persona2.getName() + ", Edad: " + persona2.getAge() );
		
		System.out.println("Comprobamos si es la misma instancia de persona ");
		if (persona1 == persona2) {
			System.out.println("La instancia es la misma");
		}else {
			System.out.println("No son la misma instancia");
		}
	}
	
	
	void prototypeTest() {
		Person persona1 = configPerson.createPrototypePerson();
		Person persona2 = configPerson.createPrototypePerson();
		
		
		System.out.println("Persona 1 : \n" + "Nombre : " + persona1.getName() + ", Edad: " + persona1.getAge() );
		System.out.println("Persona 2 : \n" + "Nombre : " + persona2.getName() + ", Edad: " + persona2.getAge() );
		
		
		System.out.println("Comprobamos si es la misma instancia de persona ");
		if (persona1 == persona2) {
			System.out.println("La instancia es la misma");
		}else {
			System.out.println("No son la misma instancia");
		}	
		
		
	}

}
