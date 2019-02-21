package com.cg.app.helloworld.resource;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.netflix.discovery.DiscoveryClient;

@RestController("/helloworlds")
public class HelloWorldResource {
	
	/*
	 * @Autowired private DiscoveryClient discoveryClient;
	 */
	
	
	@GetMapping
	public String echoHello() {
		return "HelloWorld!!!";
	}

}