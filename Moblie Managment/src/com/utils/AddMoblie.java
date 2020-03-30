package com.utils;

import java.util.Hashtable;

import com.data.MoblieGenric;

interface Visitor {
	public void visit(Visitable v);
}

interface Visitable {
	public void accept(Visitor v);
}

public class AddMoblie implements Visitable {

	public MoblieGenric<String, Integer> moblieGenric;
	public static AddMoblie single;

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	public AddMoblie() {
		moblieGenric = new MoblieGenric<String, Integer>();
	}

	public void insertMoblie(String name, int price) {
		moblieGenric.setName(name);
		moblieGenric.setPrice(price);
		moblieGenric.InsertMoblie();
	}

	public Hashtable<String, Integer> getData() {
		return moblieGenric.DisplayMoblie();
	}

	public static AddMoblie getInstance() {
		return (single == null) ? single = new AddMoblie() : single;
	}

}
