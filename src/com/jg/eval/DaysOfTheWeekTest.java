package com.jg.eval;

import static org.junit.Assert.*;

import org.junit.Test;

public class DaysOfTheWeekTest {

	@Test
	public void testIsWeekend() {
		assertEquals("Now thats not right...", DaysOfTheWeek.MONDAY, DaysOfTheWeek.valueOf("MONDAY") );
		assertEquals("Now thats not right...", DaysOfTheWeek.TUESDAY, DaysOfTheWeek.valueOf("TUESDAY") );
		assertEquals("Now thats not right...", DaysOfTheWeek.WEDNESDAY, DaysOfTheWeek.valueOf("WEDNESDAY") );
		assertEquals("Now thats not right...", DaysOfTheWeek.THURSDAY, DaysOfTheWeek.valueOf("THURSDAY") );
		assertEquals("Now thats not right...", DaysOfTheWeek.FRIDAY, DaysOfTheWeek.valueOf("FRIDAY") );
		assertEquals("Now thats not right...", DaysOfTheWeek.SATURDAY, DaysOfTheWeek.valueOf("SATURDAY") );
		assertEquals("Now thats not right...", DaysOfTheWeek.SUNDAY, DaysOfTheWeek.valueOf("SUNDAY") );
	}
	@Test
	public void testIsWeekdayM() {
		assertEquals("Oops",false,DaysOfTheWeek.isWeekend(DaysOfTheWeek.MONDAY) );
	}
	@Test
	public void testIsWeekdayTu() {
		assertEquals("Oops",false,DaysOfTheWeek.isWeekend(DaysOfTheWeek.TUESDAY) );
	}
	@Test
	public void testIsWeekdayW() {
		assertEquals("Oops",false,DaysOfTheWeek.isWeekend(DaysOfTheWeek.WEDNESDAY) );
	}
	@Test
	public void testIsWeekdayTh() {
		assertEquals("Oops",false,DaysOfTheWeek.isWeekend(DaysOfTheWeek.THURSDAY) );
	}
	@Test
	public void testIsWeekdayF() {
		assertEquals("Oops",false,DaysOfTheWeek.isWeekend(DaysOfTheWeek.FRIDAY) );
	}
	@Test
	public void testIsWeekdaySa() {
		assertEquals("Oops",true,DaysOfTheWeek.isWeekend(DaysOfTheWeek.SATURDAY) );
	}
	@Test
	public void testIsWeekdaySu() {
		assertEquals("Oops",true,DaysOfTheWeek.isWeekend(DaysOfTheWeek.SUNDAY) );
	}

}
