package org.learn.java;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;

//@Component
//@Service
//@Repository
//@Scope(value="prototype")

public class ClassB {

	@Value("2001")
	private int id;

//	@Autowired
	@Inject
	private ClassA a;
	
	@PostConstruct
	public void init() {
		System.out.println("Init method of class B get called");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Destroy method of B get called");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ClassA getA() {
		return a;
	}

	public void setA(ClassA a) {
		this.a = a;
	}

}
