package com.rbu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProfilesApplication {

	public static void main(String[] args) {
		ApplicationContext ap=SpringApplication.run(ProfilesApplication.class, args);
		TestDao dao=ap.getBean(TestDao.class);
		System.out.println(dao);
	}

}
