package com.gwg.demo.spring.autowire.test;

public class PersonService {
	
	private Person person;
	
	PersonService(Person person){
		this.person = person;
	}
	
	public String getPersonName(){
		
		return person.getName();
	}

}
