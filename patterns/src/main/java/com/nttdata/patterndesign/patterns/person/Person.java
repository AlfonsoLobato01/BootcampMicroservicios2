package com.nttdata.patterndesign.patterns.person;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
public class Person {
	
	
	public String name;
	public  int age;
	
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	
	
	

}
