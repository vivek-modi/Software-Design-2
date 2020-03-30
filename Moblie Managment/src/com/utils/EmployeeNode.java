package com.utils;

public class EmployeeNode {

	protected int key, age, salary;
	protected String name;

	public EmployeeNode(int key, String name, int age, int salary) {
		this.key = key;
		this.age = age;
		this.salary = salary;
		this.name = name;
	}
	
	public int getKey() {
		return key;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

}
