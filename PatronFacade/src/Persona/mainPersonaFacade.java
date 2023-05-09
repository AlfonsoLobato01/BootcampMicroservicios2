package Persona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mainPersonaFacade {

	public static void main(String[] args) {
		List<Person> personas = new ArrayList<>();
		personas.add(new Person("Juan", 18));
		personas.add(new Person("Maria", 25));
		personas.add(new Person("Pedro", 30));
		personas.add(new Person("Luis", 35));
		personas.add(new Person("Ana", 22));
		
		System.out.println("Todas las personas");
		
		System.out.println(Arrays.asList(personas));

        PersonFacade personFacade = new PersonFacade(personas);
        List<Person> result = personFacade.PersonasEntre20y30();
        System.out.println("Lista entre 20 y 30 años");
        for (Person person : result) {
            System.out.println("Nombre : " + person.getName() + ", Edad:  " + person.getAge());
        }

	}

}
