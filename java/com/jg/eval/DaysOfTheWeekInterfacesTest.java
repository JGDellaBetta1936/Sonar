package com.jg.eval;

import static org.junit.Assert.*;

import org.junit.Test;

public class DaysOfTheWeekInterfacesTest {

	@Test
	public void testMondayWeekend() {
		assertEquals("Nope.",false,DaysOfTheWeekInterfaces.MONDAY.isWeekend());
	}
	
	@Test
	public void testTuesdayWeekend() {
		assertEquals("Nope.",false,DaysOfTheWeekInterfaces.TUESDAY.isWeekend());	
	}
	@Test
	public void testWednesdayWeekend() {
		assertEquals("Nope.",false,DaysOfTheWeekInterfaces.WEDNESDAY.isWeekend());	
	}
	@Test
	public void testThursdayWeekend() {
		assertEquals("Nope.",false,DaysOfTheWeekInterfaces.THURSDAY.isWeekend());	
	}
	@Test
	public void testFridayWeekend() {
		assertEquals("Nope.",false,DaysOfTheWeekInterfaces.FRIDAY.isWeekend());	
	}
	@Test
	public void testSaturdayWeekend() {
		assertEquals("Nope.",true,DaysOfTheWeekInterfaces.SATURDAY.isWeekend());	
	}
	@Test
	public void testSundayWeekend() {
		assertEquals("Nope.",true,DaysOfTheWeekInterfaces.SUNDAY.isWeekend());	
	}
	@Test
	public void testMondayWeekendCloudy() {
		assertNotEquals("Nope.",true,DaysOfTheWeekInterfaces.MONDAY.isWeekend());
	}
	@Test
	public void testTuesdayWeekendCloudy() {
		assertNotEquals("Nope.",true,DaysOfTheWeekInterfaces.TUESDAY.isWeekend());
	}
	@Test
	public void testWednewdayWeekendCloudy() {
		assertNotEquals("Nope.",true,DaysOfTheWeekInterfaces.WEDNESDAY.isWeekend());
	}
}
