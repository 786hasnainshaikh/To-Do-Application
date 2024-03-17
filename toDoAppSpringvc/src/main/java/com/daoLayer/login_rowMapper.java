package com.daoLayer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.entities.user;

public class login_rowMapper implements RowMapper<user>{

	@Override
	public user mapRow(ResultSet rs, int rowNum) throws SQLException {
		user obj=new user();
		obj.setId(rs.getInt(1));
		obj.setUsername(rs.getString(2));
		obj.setEmail(rs.getString(3));
		obj.setAddress(rs.getString(4));
		obj.setPassword(rs.getString(5));
		return obj;
	}

}
