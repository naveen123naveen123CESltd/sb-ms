package com.rbu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {
	@Value("${app.database.schema}")
	private String databaseSchema;
	@Value("${app.dateformat}")
	private String dateformat;
	@Override
	public String toString() {
		return "TestDao [databaseSchema=" + databaseSchema + ", dateformat=" + dateformat + "]";
	}
	

}
