package com.jg.eval;

import java.util.List;
import java.util.Collections;

import org.apache.log4j.Logger;

public class SortingExamples {
	static Logger log = Logger.getLogger(SortingExamples.class.getName());
	
	private static final String COLLECTIONSSTATIC = " Collection.sort() :\n";
	private static final String LISTBEFORE = "List before the use of";
	private static final String LISTAFTER = "List after the use of";
	
	private SortingExamples () {
		
	}
	public static String sortTheList(List<String> inputs) {
		log.info(LISTBEFORE + COLLECTIONSSTATIC + inputs);
		StringBuilder sb = new StringBuilder();

		/*
		 * Collections.sort method is sorting the elements of List in
		 * ascending order.
		 */
		Collections.sort(inputs);
		sb.append(inputs);

		log.info(LISTAFTER + COLLECTIONSSTATIC + inputs);
		return sb.toString();
	}

	public static String sortTheListInteger(List<Integer> inputs) {
		log.info(LISTBEFORE + COLLECTIONSSTATIC + inputs);

		/*
		 * Collections.sort method is sorting the elements of List in
		 * ascending order.
		 */
		Collections.sort(inputs);
		StringBuilder sb = new StringBuilder();
		sb.append(inputs);

		log.info(LISTAFTER + COLLECTIONSSTATIC + inputs);
		return sb.toString();
	}

}
