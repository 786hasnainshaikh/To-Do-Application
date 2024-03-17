package com.serviceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoLayer.daoImpl;
import com.entities.todo;
import com.entities.user;


@Service
public class serviceIpl implements serviceInterface {
    
	
	@Autowired
	daoImpl daoImpl;
	
	
	
	
	@Override
	public boolean addtodo(todo todo) {
		boolean addtodo = daoImpl.addtodo(todo);
		return addtodo;
		
	}

	@Override
	public void updatetodo(todo todo) {
		daoImpl.updatetodo(todo);
		
	}

	@Override
	public void deletetodo(int id) {
		daoImpl.deletetodo(id);
		
	}

	@Override
	public todo gettodo(int id) {
		todo gettodo = daoImpl.gettodo( id);
		return gettodo;
	}

	@Override
	public List<todo> getalltodo() {
		List<todo> list = daoImpl.getalltodo();
		return list;
	}

	@Override
	public void register(user user) {
		daoImpl.register(user);
		
	}

	@Override
	public user login(String email, String password) {
		user user = daoImpl.login(email, password);
		return user;
	}
	
	
	

}
