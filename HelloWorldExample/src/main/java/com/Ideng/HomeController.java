package com.Ideng;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/hello")
	public String home(){
		return "Welcome to Spring Boot!";
	}
}
/*first stop the server... incase of eclipse we need to stop and then start the server but 
 * in case of IntelliJ we dont need to do that...now go to HelloWorldExampleApplication
 *  and run as spring boot app.. then at http://localhost:8080/hello we will get output as
 *  Welcome to Spring Boot!*/
 */