package com.rbu;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	@Autowired
	Date date;
	@Bean
	public Date createdt() {
		return new Date();
	}

}
