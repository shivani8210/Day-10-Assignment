package com.shi.q2;

public abstract class Student {
	
	String name;
	
	String address;
	
	abstract void getPercentage();
	
	public Student(String name, String address) {
		
		this.name = name;
		
		this.address = address;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public String getAddress() {
		
		return address;
		
	}

}
