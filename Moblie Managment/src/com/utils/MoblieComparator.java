package com.utils;

import java.util.Comparator;

import com.data.MoblieQueue;

public class MoblieComparator implements Comparator<MoblieQueue> {

	@Override
	public int compare(MoblieQueue o1, MoblieQueue o2) {
		return o2.getCount() - o1.getCount();
	}

}
