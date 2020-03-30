package com.utils;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class AddEmployee {

	public static AddEmployee single;
	private SortedSet<EmployeeNode> EmployeeNodeValue;

	public AddEmployee() {
		EmployeeNodeValue = new TreeSet<EmployeeNode>(new The_Comparator());
	}

	public void addEmployeData(int key, String name, int age, int salary) {
		EmployeeNodeValue.add(new EmployeeNode(key, name, age, salary));
	}

	public void display() {
		for (EmployeeNode employeeNode : EmployeeNodeValue) {
			System.out.println("Key: " + employeeNode.getKey() + " Name: " + employeeNode.getName() + " Age: "
					+ employeeNode.getAge() + " Salary: " + employeeNode.getSalary());
		}
	}

	public void SearchEmployee(String name) {
		for (EmployeeNode employeeNode : EmployeeNodeValue) {
			if (employeeNode.getName().contains(name)) {
				System.out.println(employeeNode.getAge());
				break;
			} else {
				System.out.println("NO FOUND");
			}
		}
	}

	public static AddEmployee getInstance() {
		return (single == null) ? single = new AddEmployee() : single;
	}

}
