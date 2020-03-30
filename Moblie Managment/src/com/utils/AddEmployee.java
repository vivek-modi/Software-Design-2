package com.utils;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import com.data.EmployeeNode;

public class AddEmployee {

	public static AddEmployee single;
	private SortedSet<EmployeeNode> EmployeeNodeValue;

	public AddEmployee() {
		Comparator<EmployeeNode> nameComparator = Comparator.comparing(EmployeeNode::getName);
		EmployeeNodeValue = new TreeSet<EmployeeNode>(nameComparator);
	}

	public void addEmployeData(int key, String name, String model, int salary) {
		EmployeeNodeValue.add(new EmployeeNode(key, name, model, salary));
	}

	public void display() {
		EmployeeNodeValue.forEach(employee -> System.out.println("Key: " + employee.getKey() + " Name: "
				+ employee.getName() + " Age: " + employee.getModel() + " Salary: " + employee.getSalary()));
	}

	public void SearchEmployee(String name) {
		boolean nofound = true;
		for (EmployeeNode employeeNode : EmployeeNodeValue) {
			if (employeeNode.getName().contains(name)) {
				System.out.println("Key: " + employeeNode.getKey() + " Name: " + employeeNode.getName() + " Age: "
						+ employeeNode.getModel() + " Salary: " + employeeNode.getSalary());
				nofound = true;
				break;
			} else {
				nofound = false;
			}
		}
		System.out.println((nofound) ? "" : "NO FOUND");
	}

	public static AddEmployee getInstance() {
		return (single == null) ? single = new AddEmployee() : single;
	}

}
