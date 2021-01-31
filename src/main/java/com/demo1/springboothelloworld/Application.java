package com.demo1.springboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.beans.factory.annotation.Autowired;




@RestController
@ComponentScan
@SpringBootApplication
@EnableConfigurationProperties(AppConfiguration.class)
public class Application implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		
		
		Service myapp = new Service();
		System.out.println("______________________________");
		myapp.print();
		System.out.println("______________________________");
	}
	
	@RequestMapping("/home")
	public String hoempage() {
		return "<h1>Hello from TomCat</h1>";
	}
	
}
