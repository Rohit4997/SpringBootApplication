package com.restexample.basicapi.model;

public class Course {
	
	private long id;
	private String title;
	private String descString;
	
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", descString=" + descString + "]";
	}


	public Course(long id, String title, String descString) {
		super();
		this.id = id;
		this.title = title;
		this.descString = descString;
	}
	
	
	public long getId() {
		return id;
	}
	
	
	public void setId(long id) {
		this.id = id;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getDescString() {
		return descString;
	}
	
	
	public void setDescString(String descString) {
		this.descString = descString;
	}
	
	

}
