package com.zensar.model;

public class Patient {
	private String Id;
	private String name;
	public Patient() {
		super();
	}
	public Patient(String id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
