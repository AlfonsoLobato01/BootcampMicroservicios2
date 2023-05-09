package Persona;

public class Person {	
	
		
	    private String name;
	    private int age;

	    private Person(PersonBuilder builder) {
	        this.name = builder.name;
	        this.age = builder.age;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public static Person createPerson(PersonBuilder builder) {
	        return new Person(builder);
	    }

	    public static class PersonBuilder {
	        private String name;
	        private int age;

	        public PersonBuilder withName(String name) {
	            this.name = name;
	            return this;
	        }

	        public PersonBuilder withAge(int age) {
	            this.age = age;
	            return this;
	        }

	        public Person build() {
	            return new Person(this);
	        }
	    }
	

	@Override
	public String toString() {
		return "Persona [Nombre=" + name + ", Edad=" + age + "]";
	}
    
    
    
    
    
	
	
	
	

	
	
	

}
