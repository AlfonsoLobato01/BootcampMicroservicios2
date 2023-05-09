package PersonaMain;

import Persona.Person;

public class MainPersona {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person persona1 = new Person("Juan", 25);
		
		Person persona2 = persona1.clone();
		
		
		System.out.println(persona1);
		System.out.println(persona2);
		
		
        


	}

}
