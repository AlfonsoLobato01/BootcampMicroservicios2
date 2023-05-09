package PersonaMain;

import Persona.Person;

public class MainPersona {

	public static void main(String[] args) {
        
        Person persona1 = Person.getInstance();

       
        Person persona2 = Person.getInstance();

        
        System.out.println(persona1 == persona2); 

        
        System.out.println(persona1.getName()); 
        System.out.println(persona1.getAge()); 

	}

}
