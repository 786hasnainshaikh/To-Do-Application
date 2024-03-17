package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.entities.todo;
import com.serviceLayer.serviceIpl;

@Controller
public class controller {
	
	@Autowired
	serviceIpl serviceIpl;
	
	
	
	
	// homepage
	@RequestMapping("/")
	public String homepage(Model m) {
		
		List<com.entities.todo> list = serviceIpl.getalltodo();
		m.addAttribute("list",list);
		return "index";
	}
	
	
	// add todo page
	@RequestMapping("/addtodo")
	public String addtodopage() {
		
		
		return "addToDo";
	}
	
	
	// get data from addto 
	// insert into database
	@RequestMapping(path = "/processtodo" ,method = RequestMethod.POST)
	public String addtofrom(@ModelAttribute todo todo, Model m) {
		
		if (todo.getTodpTitle().isBlank() || todo.getTodoContent().isEmpty() || todo.getDate().isEmpty()) {
			m.addAttribute("msg", "values cant be blank");
			return "addToDo";
		} 
		else {
			boolean addtodo = serviceIpl.addtodo(todo);
			if (addtodo == true) {
				m.addAttribute("msg", "To Do Added Successfully");
				return "addToDo";
			}
			else {
				m.addAttribute("msg", "TO Cant Added");
				return "addToDo";
			}
			
		}
		
		
	}
	
	
	// delete todo
	@RequestMapping("/delete/{id}")
	public String deletetodo(@PathVariable ("id") int id) {
		
		serviceIpl.deletetodo(id);
		return "index";
		
	}
	
	
	// get single todo
	
	@RequestMapping("/edit/{id}")
	public String singletodo(@PathVariable("id") int id , Model m) {
		todo todo = serviceIpl.gettodo(id);
		// get values of single object and set edit.jsp values
		m.addAttribute("todo", todo);
		return "edit";
	}
	
	
	// update controller
	@RequestMapping(path = "/edit/updatetodo" )
	public String updatetodo(@ModelAttribute todo todo ) {
		serviceIpl.updatetodo(todo);
		return "index";
	}
	
	
	
	
	
	
	
	
}
