package com.daoLayer;

import java.util.List;

import com.entities.todo;
import com.entities.user;

public interface daoInterface {
	public boolean addtodo(todo todo);
	public void updatetodo(todo todo);
	public void deletetodo(int id);
	public todo gettodo(int id);
	public List<todo> getalltodo();
	
	
	public void register(user user);
	public user login (String email, String password);
}
