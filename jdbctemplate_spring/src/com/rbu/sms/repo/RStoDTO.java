package com.rbu.sms.repo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RStoDTO implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int arg1) throws SQLException {
		StudentDTO dto=new StudentDTO();
		dto.setId(rs.getInt(1));
		dto.setName(rs.getString(2));
		dto.setEmail(rs.getString(3));
		dto.setAddress(rs.getString(4));
		return dto;
	}

}
