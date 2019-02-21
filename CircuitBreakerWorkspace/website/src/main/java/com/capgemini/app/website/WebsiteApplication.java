package com.capgemini.app.website;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capgemini.app.website.service.WebsiteService;

@EnableCircuitBreaker
@RestController
@SpringBootApplication
public class WebsiteApplication {

	@Autowired
	  private WebsiteService websiteService;
	
	@RequestMapping("/hello")
	public String toRead() {
		return websiteService.readingList();
	}
	
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(WebsiteApplication.class, args);
	}

}

