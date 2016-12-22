package com.Ideng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication: this will enable a lot of spring boot configurations by default
public class HelloWorldExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldExampleApplication.class, args);
	}
}
/*In spring boot we dont need to setup Tomcat coz spring boot bydefault comes with embeeded 
tomcat server... so we can directly run the application as spring boot app*/