package com.data;

public class EmployeeNode {

	protected int key, salary;
	protected String name,model;

	public EmployeeNode(int key, String name, String model, int salary) {
		this.key = key;
		this.model = model;
		this.salary = salary;
		this.name = name;
	}

	public int getKey() {
		return key;
	}

	public String getModel() {
		return model;
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

}
