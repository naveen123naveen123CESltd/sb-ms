package com.rbu.sms.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository2 {
	@Autowired
	NamedParameterJdbcTemplate npjdbcTemplate;

	public void save(int id, String name, String email, String address) {
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("id", id);
		map.put("name", name);
		map.put("email", email);
		map.put("address", address);
		npjdbcTemplate.update("insert into SMS_STUDENTS values(:id,:name,:email,:address)", map);
		System.out.println("success");
	}

	public void update(int id, String name, String email, String address) {
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("d", id);
		map.put("a", name);
		map.put("b", email);
		map.put("c", address);
		npjdbcTemplate.update("update SMS_STUDENTS set name=:a,email=:b,address=:c where id=:d",
				map);
		System.out.println("success");
	}

	public void delete(int id) {
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("d", id);
		npjdbcTemplate.update("delete table SMS_STUDENTS where id=:d", map);
		System.out.println("success");
	}

	public void find(int id) {
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("d", id);
		//StudentDTO std
		//Rs rs=st.executeQuery();while(rs.next()) std.setId(rs.get(1))
		
		StudentDTO dto = (StudentDTO) npjdbcTemplate.queryForObject("select * from SMS_STUDENTS where id=:d",
				map, new RStoDTO());
		
		//rs=select * from SMS_STUDENTS where id=1
		//RStoDTO.mapRow(rs):Object:StudentDTO
		
		
		
		System.out.println(dto.getId());
		System.out.println(dto.getName());
		System.out.println(dto.getEmail());
		System.out.println(dto.getAddress());
	}
	public void findAll() {
		Map map=new HashMap();
	List<Map<String,Object>> listmap=npjdbcTemplate.queryForList("select * from SMS_STUDENTS",map);
		for(Map mapdata:listmap) {
			System.out.println(mapdata.get("id"));
			System.out.println(mapdata.get("name"));
			System.out.println(mapdata.get("email"));
			System.out.println(mapdata.get("address"));
			
			
		}
		
	}
}
