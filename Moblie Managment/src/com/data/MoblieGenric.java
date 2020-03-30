package com.data;

import java.util.*;

public class MoblieGenric<X, Y> {

	private X name;
	private Y price;
	private Hashtable<X, Y> data = data = new Hashtable<X, Y>();

	public MoblieGenric() {
	}

	public void setName(X name) {
		this.name = name;
	}

	public void setPrice(Y price) {
		this.price = price;
	}

	public void InsertMoblie() {
		data.put(name, price);
	}

	public Hashtable<X, Y> DisplayMoblie() {
		return data;
	}

}
