package com.rbu.sms.config;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
public class AppConfig {
	// step1: DS
	@Bean
	public BasicDataSource createDS() {
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("oracle.jdbc.OracleDriver");
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("system");
		bds.setPassword("admin");
		bds.setMaxActive(100);
		bds.setMaxIdle(2);
		bds.setMaxIdle(1000 * 3);
		return bds;
	}

	// step2:JT
	@Bean
	public JdbcTemplate createJT() {
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(createDS());
		return jt;
	}

	// step2:NPJT
	@Bean
	public NamedParameterJdbcTemplate createNPJT() {
		NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(createDS());
		return npjt;
	}

}
