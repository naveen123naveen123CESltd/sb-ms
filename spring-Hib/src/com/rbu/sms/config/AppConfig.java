package com.rbu.sms.config;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public SessionFactory createSF() {
		org.hibernate.cfg.AnnotationConfiguration cfg=new org.hibernate.cfg.AnnotationConfiguration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		return sf;
	}
	

}
