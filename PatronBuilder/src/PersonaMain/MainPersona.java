package PersonaMain;

import Persona.Person;
import Persona.Person.PersonBuilder;

public class MainPersona {

	public static void main(String[] args) {
        
        Person persona1 = new PersonBuilder()
                .withName("Juan")
                .withAge(25)
                .build();
        
        

        System.out.println(persona1);

	}

}
