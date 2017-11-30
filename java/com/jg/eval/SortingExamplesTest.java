package com.jg.eval;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SortingExamplesTest {

	@Test
	public void testMain() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Geeks For Geeks");
		al.add("Friends");
		al.add("Dear");
		al.add("Is");
		al.add("Superb");
		assertNotNull(al);
		assertNotNull( SortingExamples.sortTheList(al) );
	}

	@Test
	public void testSortTheList() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Geeks For Geeks");
		al.add("Friends");
		al.add("Dear");
		al.add("Is");
		al.add("Superb");
		assertNotNull(al);
		assertNotNull(SortingExamples.sortTheList(al) );
	}

	@Test
	public void testSortTheListInteger() {
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(10);
		a2.add(200);
		a2.add(5);
		a2.add(9);
		a2.add(1);
		a2.add(31);
		a2.add(61);
		assertNotNull(SortingExamples.sortTheListInteger(a2) );
	}

}
