package org.learn.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("org.learn.java")
public class SpringConfig {
	
	@Bean
	@Lazy
	public ClassA classA() {
		return new ClassA();
	}
	
	@Bean(name = "OurBestBean")
	@Lazy
	@Scope(value="prototype")
	public ClassB classB() {
		return new ClassB();
	}
	
	@Bean(name = "OurBetterBean")
	@Lazy
	@Scope(value="singleton")
	public ClassB classBanotherBean() {
		return new ClassB();
	}

}
