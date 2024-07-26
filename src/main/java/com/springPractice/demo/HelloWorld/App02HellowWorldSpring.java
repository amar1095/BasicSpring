package com.springPractice.demo.HelloWorld;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HellowWorldSpring {

	public static void main(String[] args) {
	try (//1) launch a spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
		 //2) configure the thing that we want to manage- @configuration
		// hellowworldconfiguartion - @configuration
		//name - @Bean
		
		//3) Retrieving Beans managed by spring
			System.out.println(context.getBean("name" ));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean(Person.class));

			
			System.out.println(context.getBean("person5"));

			System.out.println(context.getBean("person2"));
			System.out.println(context.getBean("person3"));
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);





		

	}

}
