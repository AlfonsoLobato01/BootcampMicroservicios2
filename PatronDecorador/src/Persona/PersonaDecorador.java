package Persona;

public class PersonaDecorador implements iPersona{
	
	private iPersona ipersona;
	private String salto;
	
	

	public PersonaDecorador(iPersona ipersona, String salto) {
		this.ipersona = ipersona;
		this.salto = salto;
	}

	public String getSalto() {
		return salto;
	}



	public void setSalto(String salto) {
		this.salto = salto;
	}

	@Override
	public String toString() {
		return ipersona.toString() + salto;
	}

	@Override
	public String saltar() {
		return ipersona.saltar() +  ",  " +salto;
		
	}
	
	

}
