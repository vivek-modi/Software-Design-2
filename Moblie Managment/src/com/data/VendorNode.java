package com.data;

public class VendorNode {

	public int key;
	public String name, password;
	public VendorNode right,left;

	public VendorNode(int key, String name, String password, VendorNode left, VendorNode right) {
		this.key = key;
		this.name = name;
		this.password = password;
		this.left = left;
		this.right = right;
	}

	public int getKey() {
		return key;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}
}
