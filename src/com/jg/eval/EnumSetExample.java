package com.jg.eval;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;

public class EnumSetExample {
	private static Logger log = Logger.getLogger(EnumSetExample.class.getName());
	static final  Set<DaysOfTheWeek> enumSetAll = EnumSet.allOf(DaysOfTheWeek.class);
	static final Set<DaysOfTheWeek> enumNone = EnumSet.noneOf(DaysOfTheWeek.class);
	static final Set<DaysOfTheWeek> enumDOW = EnumSet.of(DaysOfTheWeek.SUNDAY, DaysOfTheWeek.SATURDAY);

	private EnumSetExample() {

	}

	public static void main(String[] args) {

		printTheInfo(enumSetAll, "enumSetAll");
		printTheInfo(enumNone, "enumSetNonOf");
		printTheInfo(enumDOW, "enumSetDasyOfweek");

	}

	private static void printTheInfo(Set<DaysOfTheWeek> enumSet, String from) {
		Iterator<DaysOfTheWeek> iter = enumSet.iterator();
		while (iter.hasNext()) {
			log.info("From method--> " + from + " iter next--> " + iter.next());
		}
	}
}
