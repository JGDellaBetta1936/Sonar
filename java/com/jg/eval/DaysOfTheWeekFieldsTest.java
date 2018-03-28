package com.jg.eval;

import static org.junit.Assert.*;

import org.junit.Test;

public class DaysOfTheWeekFieldsTest {

	@Test
	public void testIsWeekend() {
		assertEquals("Now thats not right...", DaysOfTheWeekFields.MONDAY, DaysOfTheWeekFields.valueOf("MONDAY") );
		assertEquals("Now thats not right...", DaysOfTheWeekFields.TUESDAY, DaysOfTheWeekFields.valueOf("TUESDAY") );
		assertEquals("Now thats not right...", DaysOfTheWeekFields.WEDNESDAY, DaysOfTheWeekFields.valueOf("WEDNESDAY") );
		assertEquals("Now thats not right...", DaysOfTheWeekFields.THURSDAY, DaysOfTheWeekFields.valueOf("THURSDAY") );
		assertEquals("Now thats not right...", DaysOfTheWeekFields.FRIDAY, DaysOfTheWeekFields.valueOf("FRIDAY") );
		assertEquals("Now thats not right...", DaysOfTheWeekFields.SATURDAY, DaysOfTheWeekFields.valueOf("SATURDAY") );
		assertEquals("Now thats not right...", DaysOfTheWeekFields.SUNDAY, DaysOfTheWeekFields.valueOf("SUNDAY") );
	}
	@Test
	public void testIsWeekdayM() {
		assertEquals("Oops",false,DaysOfTheWeekFields.valueOf("MONDAY").isWeekend() );
	}
	@Test
	public void testIsWeekdayTU() {
		assertEquals("Oops",false,DaysOfTheWeekFields.valueOf("TUESDAY").isWeekend() );
	}
	@Test
	public void testIsWeekdayWE() {
		assertEquals("Oops",false,DaysOfTheWeekFields.valueOf("WEDNESDAY").isWeekend() );
	}
	@Test
	public void testIsWeekdayTH() {
		assertEquals("Oops",false,DaysOfTheWeekFields.valueOf("THURSDAY").isWeekend() );
	}
	@Test
	public void testIsWeekdayFR() {
		assertEquals("Oops",false,DaysOfTheWeekFields.valueOf("FRIDAY").isWeekend() );
	}
	@Test
	public void testIsWeekdaySA() {
		assertEquals("Oops",true,DaysOfTheWeekFields.valueOf("SATURDAY").isWeekend() );
	}
	@Test
	public void testIsWeekdaySU() {
		assertEquals("Oops",true,DaysOfTheWeekFields.valueOf("SUNDAY").isWeekend() );
	}
	
	@Test
	public void testIsWeekdayMondayCloudy() {
		assertNotEquals("Oops",true,DaysOfTheWeekFields.valueOf("MONDAY").isWeekend() );
	}
	@Test
	public void testIsWeekdayTuesdayCloudy() {
		assertNotEquals("Oops",true,DaysOfTheWeekFields.valueOf("TUESDAY").isWeekend() );
	}
	@Test
	public void testIsWeekdayWednesdayCloudy() {
		assertNotEquals("Oops",true,DaysOfTheWeekFields.valueOf("WEDNESDAY").isWeekend() );
	}
	@Test
	public void testIsWeekdayThursdayCloudy() {
		assertNotEquals("Oops",true,DaysOfTheWeekFields.valueOf("THURSDAY").isWeekend() );
	}
	@Test
	public void testIsWeekdayFridayCloudy() {
		assertNotEquals("Oops",true,DaysOfTheWeekFields.valueOf("FRIDAY").isWeekend() );
	}
	@Test
	public void testIsWeekdaySaturdayCloudy() {
		assertNotEquals("Oops",false,DaysOfTheWeekFields.valueOf("SATURDAY").isWeekend() );
	}
	@Test
	public void testIsWeekdaySundayCloudy() {
		assertNotEquals("Oops",false,DaysOfTheWeekFields.valueOf("SUNDAY").isWeekend() );
	}
}
