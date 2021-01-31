package com.demo1.springboothelloworld;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "myapp")
public class AppConfiguration {
	
	private String mail;
	private String password;
	
	
	public String getMail() {
		return mail;
	}
	
	public String getPassword() {
		return password;
	}
			
}

