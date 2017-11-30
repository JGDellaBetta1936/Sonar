package com.jg.eval;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;


public class ReadSystemProperties {
	static Logger log = Logger.getLogger(ReadSystemProperties.class.getName());

	public String showSystemProperties() {
		StringBuilder sb = new StringBuilder();
		Properties sysProps = System.getProperties();
		Set<Object> keySet = sysProps.keySet();
		Iterator<Object> keyIter = keySet.iterator();
		while (keyIter.hasNext()) {
			String key = keyIter.next().toString();
			String value = System.getProperty(key);
			sb.append("k/v->" + key + " " + value);
		}

		log.info("showSystemProperties returning results.");
		return sb.toString();
		
	}
}
