package com.capgemini.app.HelloWorld.resource;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

	@RequestMapping(value="/helloworlds")
	public String readingList() {
		return "HelloWorld!!!";
		
	}

}