package com.daoLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.entities.todo;
import com.entities.user;


@Repository
public class daoImpl implements daoInterface{
	
	
	@Autowired
	private JdbcTemplate template;
	
	

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
  
	
	// add todo
	@Override
	public boolean addtodo(todo todo) {
		boolean flage=false;
		String query="insert into todo_data(todo_Title, todo_content, date) values(?,?,?)";
		int i = this.template.update(query, todo.getTodpTitle(), todo.getTodoContent(), todo.getDate());
		if (i==1) {
			flage=true;
		}
		else {
			return flage;
		}
		return flage;
	}
    
	//update todo
	@Override
	public void updatetodo(todo todo) {
		String query="update todo_data set todo_Title=?, todo_content=?, date=? where id=?";
		this.template.update(query, todo.getTodpTitle(), todo.getTodoContent(),todo.getDate(), todo.getId());
		
	}

	
	// delete object
	@Override
	public void deletetodo(int id) {
		String query="DELETE FROM todo_data WHERE id=?";
	    int delete=this.template.update(query, id);
		if (delete==1) {
			System.out.println("data deleted");
		}
		
	}
    // get single object and show this object values in edit.jsp and and update in update handler
	@Override
	public todo gettodo(int id) {
		String query="select * FROM todo_data WHERE id=?";
		rowmapper obj= new rowmapper();
		todo object = this.template.queryForObject(query, obj, id);
		
		return object;
	}

	// get all objects
	@Override
	public List<todo> getalltodo() {
		String query="select * from todo_data";
		rowmapper rowmapper= new rowmapper();
		List<todo> list = this.template.query(query,rowmapper);
		return list;
	}
	
	
	// register 

	@Override
	public void register(user user) {
		String query="insert into register_details(username, email,address,password) values(?,?,?,?)";
		int i = this.template.update(query, user.getUsername(), user.getEmail(),user.getAddress(),user.getPassword());
		if (i==1) {
			System.out.println("datainserted");
		}
		
	}

	// login
	@Override
	public user login(String email, String password) {
		String query= " select * from register_details where email= '"+ email +" '  and password='"+ password +" ' ";
		
		login_rowMapper obj= new login_rowMapper();
		
		user user = this.template.queryForObject(query, obj);
        System.out.println(user);
		
		
		
		return null;
	}
	
	
	
	

}
