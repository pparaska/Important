package com.capgemini.app.APIGatewayProxyServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.capgemini.app.APIGatewayProxyServer.filter.ErrorFilter;
import com.capgemini.app.APIGatewayProxyServer.filter.PostFilter;
import com.capgemini.app.APIGatewayProxyServer.filter.PreFilter;
import com.capgemini.app.APIGatewayProxyServer.filter.RouteFilter;

@EnableZuulProxy
@SpringBootApplication
public class ApiGatewayProxyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayProxyServerApplication.class, args);
	}



@Bean
public PreFilter preFilter() {
    return new PreFilter();
}

@Bean
public PostFilter postFilter() {
    return new PostFilter();
}

@Bean
public ErrorFilter errorFilter() {
    return new ErrorFilter();
}

@Bean
public RouteFilter routeFilter() {
    return new RouteFilter();
}
}
