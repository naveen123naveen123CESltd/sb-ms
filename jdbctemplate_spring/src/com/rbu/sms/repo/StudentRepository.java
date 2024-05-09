package com.rbu.sms.repo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void save(int id, String name, String email, String address) {
		jdbcTemplate.update("insert into SMS_STUDENTS values(?,?,?,?)", new Object[] { id, name, email, address });
		System.out.println("success");
	}

	public void update(int id, String name, String email, String address) {
		jdbcTemplate.update("update SMS_STUDENTS set name=?,email=?,address=? where id=?",
				new Object[] { name, email, address, id });
		System.out.println("success");
	}

	public void delete(int id) {
		jdbcTemplate.update("delete table SMS_STUDENTS where id=?", new Object[] { id });
		System.out.println("success");
	}

	public void find(int id) {
		StudentDTO dto = (StudentDTO) jdbcTemplate.queryForObject("select * from SMS_STUDENTS where id=?",
				new Object[] { id }, new RStoDTO());
		System.out.println(dto.getId());
		System.out.println(dto.getName());
		System.out.println(dto.getEmail());
		System.out.println(dto.getAddress());
	}

	public void findAll() {
		List<Map<String,Object>> listmap=jdbcTemplate.queryForList("select * from SMS_STUDENTS");
		for(Map map:listmap) {
			System.out.println(map.get("id"));
			System.out.println(map.get("name"));
			System.out.println(map.get("email"));
			System.out.println(map.get("address"));
			
			
		}
		
	}
	
	
}
