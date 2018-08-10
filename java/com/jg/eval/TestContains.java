package com.jg.eval;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

class TestContains {
	static Logger log = Logger.getLogger(TestContains.class.getName()) ;
	private TestContains () {
		
	}
	public static void main(String[] args) {

		int[] myIntArray = {-9, 14, 37, 102};
		int[] myIntArray2 = {14,15,16,17,102};
		List<Integer> list = new ArrayList<>(myIntArray.length);
		int inValue = Integer.parseInt(args[0]);
		log.info("input-->" + inValue);
		for (int i : myIntArray) {
			list.add(Integer.valueOf(i));
		}
		List<Integer> list2 = new ArrayList<>(myIntArray2.length);
		for (int j : myIntArray2) {
			list2.add(Integer.valueOf(j));
		}
		log.info("A-->" + list.contains(inValue) );
		
		if (list2.contains(new Integer(16))) {
			log.info("B-->found it.");
		}
		


	}
}
