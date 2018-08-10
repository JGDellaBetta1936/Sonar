package com.jg.eval;

import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.apache.log4j.Logger;

public class HashTables {

	static Logger log = Logger.getLogger(HashTables.class.getName() );
	public HashTables() {
		// TODO Auto-generated constructor stub
	}
	public static void main (String [] agrs) throws InstantiationException, IllegalAccessException {
		HashTables ht = new HashTables();
		ht.addToHasTable();
	}
	public void addToHasTable () throws InstantiationException, IllegalAccessException {
		Long startTime;
		Long endTime;
		Hashtable<Integer, Integer> tempHT = new Hashtable<Integer, Integer>();
		for (int i=0; i<100; i++) {
			long tempInt = Calendar.getInstance().getTimeInMillis() + Random.class.newInstance().nextInt()   + 1;
			 if (tempInt <= 0) {
				 log.info("Skipping.");
				 continue;
			 }
			tempHT.put(i, (int) (Calendar.getInstance().getTimeInMillis() + Random.class.newInstance().nextInt() )  + 1);	
		}
		
		Set<Integer> tempSet = tempHT.keySet();
		Iterator<Integer> tempIter = tempSet.iterator();
		startTime = Calendar.getInstance().getTimeInMillis();
		while  (tempIter.hasNext()) {
			int tempInt = tempIter.next();
			log.info("keysetIter- " + tempInt +  "   value->"  + tempHT.get(tempInt));

		}
		endTime = Calendar.getInstance().getTimeInMillis();
		log.info("Iterator over KeySet Duration--> " + (endTime - startTime) );
		
		
		Enumeration<Integer> ti2 = tempHT.keys();
		startTime = Calendar.getInstance().getTimeInMillis();
		while (ti2.hasMoreElements()) {
			Integer tempInt = ti2.nextElement();
			log.info("keysEnum- " + tempInt + "    value-->"+ tempHT.get(tempInt) );
		}
		endTime = Calendar.getInstance().getTimeInMillis();
		log.info("Enumeration over keys Duration--> " + (endTime - startTime) );
	}

}
