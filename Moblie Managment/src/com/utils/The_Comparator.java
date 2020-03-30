package com.utils;

import java.util.Comparator;

public class The_Comparator implements Comparator<EmployeeNode> {

	@Override
	public int compare(EmployeeNode e1, EmployeeNode e2) {
		return e1.getName().compareTo(e2.getName());
	}

}
