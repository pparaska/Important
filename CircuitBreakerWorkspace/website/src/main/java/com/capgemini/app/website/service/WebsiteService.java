package com.capgemini.app.website.service;

import java.net.URI;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class WebsiteService {
	private final RestTemplate restTemplate;

	  public WebsiteService(RestTemplate rest) {
	    this.restTemplate = rest;
	  }

	  @HystrixCommand(fallbackMethod = "rest")
	  public String readingList() {
	    URI uri = URI.create("http://localhost:8787/helloworlds");

	    return this.restTemplate.getForObject(uri, String.class);
	  }

	  public String rest() {
	    return "Service is busy....";
	  }

	}
