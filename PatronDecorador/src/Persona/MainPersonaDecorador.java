package Persona;

public class MainPersonaDecorador {

	public static void main(String[] args) {
		
		iPersona persona1 = new Person("Alfonso", 32);
		System.out.println(persona1.saltar());
		
		iPersona PersonaDecorador = new PersonaDecorador(persona1, "Voy a saltar");
		System.out.println(PersonaDecorador.saltar());
		

	}

}
