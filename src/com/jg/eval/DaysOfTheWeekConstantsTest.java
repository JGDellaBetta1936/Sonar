package com.jg.eval;

import static org.junit.Assert.*;

import org.junit.Test;

public class DaysOfTheWeekConstantsTest {

	@Test
	public void testIsWeekend() {
		assertEquals("Now thats not right...", DaysOfTheWeekConstants.MONDAY, DaysOfTheWeekConstants.MONDAY) ;
		assertEquals("Now thats not right...", DaysOfTheWeekConstants.TUESDAY, DaysOfTheWeekConstants.TUESDAY) ;
		assertEquals("Now thats not right...", DaysOfTheWeekConstants.WEDNESDAY, DaysOfTheWeekConstants.WEDNESDAY );
		assertEquals("Now thats not right...", DaysOfTheWeekConstants.THURSDAY, DaysOfTheWeekConstants.THURSDAY );
		assertEquals("Now thats not right...", DaysOfTheWeekConstants.FRIDAY, DaysOfTheWeekConstants.FRIDAY );
		assertEquals("Now thats not right...", DaysOfTheWeekConstants.SATURDAY, DaysOfTheWeekConstants.SATURDAY) ;
		assertEquals("Now thats not right...", DaysOfTheWeekConstants.SUNDAY, DaysOfTheWeekConstants.SUNDAY );
	}
	@Test
	public void testIsWeekdayM() {
		assertEquals("Oops",false,DaysOfTheWeekConstants.isWeekend( DaysOfTheWeekConstants.MONDAY ) );
	}
	@Test
	public void testIsWeekdayTu() {
		assertEquals("Oops",false,DaysOfTheWeekConstants.isWeekend(DaysOfTheWeekConstants.TUESDAY) );
	}
	@Test
	public void testIsWeekdayW() {
		assertEquals("Oops",false,DaysOfTheWeekConstants.isWeekend(DaysOfTheWeekConstants.WEDNESDAY) );
	}
	@Test
	public void testIsWeekdayTh() {
		assertEquals("Oops",false,DaysOfTheWeekConstants.isWeekend(DaysOfTheWeekConstants.THURSDAY) );
	}
	@Test
	public void testIsWeekdayF() {
		assertEquals("Oops",false,DaysOfTheWeekConstants.isWeekend(DaysOfTheWeekConstants.FRIDAY) );
	}
	@Test
	public void testIsWeekdaySa() {
		assertEquals("Oops",true,DaysOfTheWeekConstants.isWeekend(DaysOfTheWeekConstants.SATURDAY) );
	}
	@Test
	public void testIsWeekdaySu() {
		assertEquals("Oops",true,DaysOfTheWeekConstants.isWeekend(DaysOfTheWeekConstants.SUNDAY) );
	}
	@Test
	public void testIsWeekdayInv() {
		assertEquals("Oops",false,DaysOfTheWeekConstants.isWeekend(DaysOfTheWeekConstants.MONDAY) );
	}

	@Test
	public void testIsWeekdayInv1() {
		assertEquals("Oops",false,DaysOfTheWeekConstants.isWeekend(DaysOfTheWeekConstants.TUESDAY) );
	}
}
