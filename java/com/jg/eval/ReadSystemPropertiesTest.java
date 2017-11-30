package com.jg.eval;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReadSystemPropertiesTest {

	@Test
	public void showSystemPropertiesTest() {
		ReadSystemProperties rsp = new ReadSystemProperties();
		assertNotNull("A value should have been returned!", rsp.showSystemProperties() );
	}

}
