package org.learn.java;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//import org.springframework.stereotype.Component;
//@Component
public class ClassA {

	
	@PostConstruct
	public void init() {
		System.out.println("Init method of class A get called");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Destroy method of A get called");
	}
	
	public String doSomething() {
		return "Hello Spring World :-)";
	}
	
}
