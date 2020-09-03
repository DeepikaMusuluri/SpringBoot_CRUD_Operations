package com.example.demo;

import org.springframework.stereotype.Component;

public class student {
	int id;
	String name;
	String college;

	public int getId() {
		return id;
	}

	public student(int id, String name, String college) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
	}

	public student() {

	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", college=" + college + "]";
	}

}
