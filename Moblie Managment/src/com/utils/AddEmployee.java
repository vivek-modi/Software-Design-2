package com.utils;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class AddEmployee {

	public static AddEmployee single;
	private SortedSet<EmployeeNode> EmployeeNodeValue;

	public AddEmployee() {
		Comparator<EmployeeNode> nameComparator = Comparator.comparing(EmployeeNode::getName);
		EmployeeNodeValue = new TreeSet<EmployeeNode>(nameComparator);
	}

	public void addEmployeData(int key, String name, int age, int salary) {
		EmployeeNodeValue.add(new EmployeeNode(key, name, age, salary));
	}

	public void display() {
		EmployeeNodeValue.forEach(employee -> System.out.println("Key: " + employee.getKey() + " Name: "
				+ employee.getName() + " Age: " + employee.getAge() + " Salary: " + employee.getSalary()));

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
