package com.springPractice.demo.HelloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {
}

record Address(String name, String city) {
}

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "amar";
	}

	@Bean
	public int age() {
		return 28;
	}

	@Bean
	public Person person() {
		return new Person("amar", 38, new Address("bengalore", "btm"));

	}

	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("bengalore", "btm");

	}

	@Bean(name = "address3")
	@Qualifier("address3Qualifier")
	public Address address3() {
		return new Address("bhabua", "moakri");

	}

	@Bean
	public Person person2() {
		return new Person(name(), age(), address());

	}

	@Bean
	public Person person3(String name, int age, Address address3) {
		return new Person(name, age, address3);

	}
	//Exception in thread "main" org.springframework.beans.
	//factory.NoUniqueBeanDefinitionException: No qualifying bean of 
	//type 'com.springPractice.demo.Person' available: expected single matching bean but found 4: person,person2,person3,person4

	@Bean
	@Primary
	public Person person4(String name, int age, Address address) {
		return new Person(name, age, address);

	}
	@Bean
	public Person person5(String name, int age, @Qualifier("address3Qualifier")Address address) {
		return new Person(name, age, address);

	}
}
