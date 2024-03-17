package com.entities;

public class todo {
	
	private int id;
	private String todpTitle;
	private String todoContent;
	private String date;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTodpTitle() {
		return todpTitle;
	}
	public void setTodpTitle(String todpTitle) {
		this.todpTitle = todpTitle;
	}
	public String getTodoContent() {
		return todoContent;
	}
	public void setTodoContent(String todoContent) {
		this.todoContent = todoContent;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "todo [id=" + id + ", todpTitle=" + todpTitle + ", todoContent=" + todoContent + ", date=" + date + "]";
	}
	
	

}
