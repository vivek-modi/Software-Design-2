package com.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import com.data.CustomerNode;
import com.message.DialogMessage;

public class AddCustomer {

	public static AddCustomer single;
	private SortedSet<CustomerNode> EmployeeNodeValue;

	public AddCustomer() {
		Comparator<CustomerNode> nameComparator = Comparator.comparing(CustomerNode::getName);
		EmployeeNodeValue = new TreeSet<CustomerNode>(nameComparator);
	}

	public void addCustomerData(int key, String name, String model, int salary) {
		EmployeeNodeValue.add(new CustomerNode(key, name, model, salary));
	}

	public void display() {
		EmployeeNodeValue.forEach(employee -> System.out.println("Key: " + employee.getKey() + " Name: "
				+ employee.getName() + " Age: " + employee.getModel() + " Salary: " + employee.getSalary()));
	}

	public String SearchCustomer(String name) {
		boolean nofound = true;
		for (CustomerNode employeeNode : EmployeeNodeValue) {
			if (employeeNode.getName().contains(name)) {
				DialogMessage.showInfoDialog("Id: " + employeeNode.getKey() + " Name: " + employeeNode.getName()
						+ " Model: " + employeeNode.getModel() + " Price: " + employeeNode.getSalary());
				nofound = true;
				break;
			} else {
				nofound = false;
			}
		}
		return ((nofound) ? "Customer Found" : "NO FOUND");
	}

	public void printbill(String name) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("bill.txt")));
		bufferedWriter.write("**Bill**");
		for (CustomerNode employeeNode : EmployeeNodeValue) {
			if (employeeNode.getName().contains(name)) {
				bufferedWriter.write("\nId: " + employeeNode.getKey() + "\nName: " + employeeNode.getName()
						+ "\nModel: " + employeeNode.getModel() + "\nPrice: " + employeeNode.getSalary());
				bufferedWriter.close();
			}

		}
	}

	public static AddCustomer getInstance() {
		return (single == null) ? single = new AddCustomer() : single;
	}

}
