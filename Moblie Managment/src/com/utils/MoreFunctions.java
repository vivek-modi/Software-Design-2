package com.utils;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.PriorityQueue;

import com.data.MoblieQueue;

public class MoreFunctions implements Visitor {

	private AddMoblie addmoblie;
	private PriorityQueue<MoblieQueue> pQueue;
	private ArrayList<MoblieQueue> arrayList;
	private boolean check = true;

	@Override
	public void visit(Visitable v) {
		addmoblie = (AddMoblie) v;
		pQueue = new PriorityQueue<MoblieQueue>(new MoblieComparator());
		arrayList = new ArrayList<MoblieQueue>();
	}

	public String SearchItem(String name) {

		if (addmoblie.getData().containsKey(name)) {
			CountItem(name);
			return "Price : " + addmoblie.getData().get(name);
		} else {
			return "No Moblie Found";
		}
	}

	public void CountItem(String name) {

		for (MoblieQueue moblieQueue : arrayList) {
			if (moblieQueue.getName().contains(name)) {
				moblieQueue.setCount(moblieQueue.getCount() + 1);
				check = false;
			}
		}
		if (check) {
			arrayList.add(new MoblieQueue(name, 1));
		}
		check = true;

		for (MoblieQueue moblieQueue : arrayList) {
			pQueue.add(moblieQueue);
		}

		while (pQueue.size() > 0) {
			MoblieQueue m = pQueue.poll();
			System.out.println(m.getName() + "  " + m.getCount());
		}
	}

}
