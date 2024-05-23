package com.rbu.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rbu.web.Student;

@Repository
public class RegRepo {
	@Autowired
	JdbcTemplate template;

//NamedParameterJdbcTemplate
	public int save(Student student) {
		int id=0;
		try {
		id = template.queryForObject("select max(id) from STUDENT_RBU", Integer.class);
		}catch(Exception e) {}
		id++;
		template.update("insert into STUDENT_RBU values(?,?,?,?)",
				new Object[] { id, student.getName(), student.getEmail(), student.getAddress() });
		return id;
	}
}
