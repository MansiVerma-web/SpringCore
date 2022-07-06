package org.learn.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {

	public static void main(String[] args) {
		/*
		 * ClassB b = new ClassB(); 
		 * ClassA a = new ClassA(); b.setA(a);
		 * System.out.println(b.getA().doSomething());
		 */

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		System.out.println("Application context is loaded");
		
		ClassB b1 = (ClassB) context.getBean("OurBetterBean");
		System.out.println(b1.getId());
		
		/*
		 * ClassB b1 = (ClassB) context.getBean("OurBetterBean");
		 * System.out.println(b1.getId());
		 */

		
		/*
		 * ClassB b2 = context.getBean(ClassB.class);
		 * 
		 * System.out.println(b1.getA().doSomething()); 
		 * System.out.println(b1.getId());
		 * 
		 * b2.setId(2002); 
		 * System.out.println(b2.getId());
		 * System.out.println(b1.getId()); // By default bean scope is singleton but we
		 * have the scope defined for Class B
		 * 
		 */
		
		((AnnotationConfigApplicationContext) context).close();
	}
}
