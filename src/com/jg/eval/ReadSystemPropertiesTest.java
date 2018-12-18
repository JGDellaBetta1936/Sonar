package com.jg.eval;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReadSystemPropertiesTest {

	@Test
	public void testShowSystemProperties() {
		ReadSystemProperties rsp = new ReadSystemProperties();
		String rtnValue = rsp.showSystemProperties();
		assertNotNull("Return value should be present.", rtnValue);
	}

}
