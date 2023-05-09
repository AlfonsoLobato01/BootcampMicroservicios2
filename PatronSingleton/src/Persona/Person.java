package Persona;

public class Person {
	
	
	private String name;
	private  int age;
	
	private Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static Person instance;
	
    public static Person getInstance() {
        if (instance == null) {
            instance = new Person("Juan", 25);
        }
        return instance;
    }
	
	
	
	

	
	
	

}
