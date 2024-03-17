package com.daoLayer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.entities.todo;

public class rowmapper implements RowMapper<todo>{

	@Override
	public todo mapRow(ResultSet rs, int rowNum) throws SQLException {
		todo obj=new todo();
		obj.setId(rs.getInt(1));
		obj.setTodpTitle(rs.getString(2));
		obj.setTodoContent(rs.getString(3));
		obj.setDate(rs.getString(4));
		return obj;
	}

}
