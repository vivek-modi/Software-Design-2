package com.utils;

import com.data.VendorNode;

public class BinarySearch {

	protected VendorNode head;
	protected VendorNode tail;
	private static BinarySearch single;

	public BinarySearch() {
		tail = new VendorNode(0, null, null, null, null);
		head = new VendorNode(-1, null, null, null, tail);
	}

	public void InsertVendor(int id, String name, String password) {
		VendorNode p, x;
		p = head;
		x = head.right;
		while (x != tail) {
			p = x;
			x = (id < x.key) ? x.left : x.right;
		}
		x = new VendorNode(id, name, password, tail, tail);
		if (id < p.key)
			p.left = x;
		else
			p.right = x;
	}

	public VendorNode search(int k) {
		VendorNode x = head.right;
		tail.key = k;
		boolean found = false;
		while (x != tail && found == false) {
			if (k == x.key)
				found = true;
			else if (k < x.key)
				x = x.left;
			else
				x = x.right;
		}
		return (x == tail) ? null : x;
	}

	public static BinarySearch getInstance() {
		return (single == null) ? single = new BinarySearch() : single;
	}
}
