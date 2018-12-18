/**
 * 
 */
package com.jg.eval;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * @author johngold
 *
 */
public class HashTableExampleTwo {
	static Logger log = Logger.getLogger(HashTableExampleTwo.class.getName());

	private HashMap<Integer, String> ht1 = new HashMap<Integer, String>();

	/**
	 * 
	 */
	public HashTableExampleTwo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		HashTableExampleTwo ht2 = new HashTableExampleTwo();
		System.out.println("First print from main");
		//ht2.printTheHashMap();
		ht2.initializeTheHashMap();
		ht2.runTheProcess();

	}


	
	
	private void runTheProcess() throws IOException {
		BufferedReader br =	 new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			// get the input, read then input based on console
			log.info("Yes...: ");
			String input = readInput(br);

			if ("q".equalsIgnoreCase(input) ) {
				log.info("Done..");
				break;
			} else if ("p".equalsIgnoreCase(input)) {
				printTheHashMap();
			} else {
				System.out.println("You requested " + input );
				Integer tempInt = Integer.valueOf(input);
				String tempS = readInput(br);
				getHt1().put(tempInt, tempS);
				System.out.println("value @key of: " + input + " returned->" + getByKeyValue(tempInt) );				
			}
		}
		
	}
	
	/**
	 * readInput(br)  reads input from console
	 * @param br
	 * @return
	 * @throws IOException
	 */
	private static String readInput(BufferedReader br) throws IOException {
		String input = br.readLine();
		return input;
	}


	private void printTheHashMap() {
		HashMap<Integer, String> ht1 = getHt1();
		if (ht1.isEmpty()) {
			System.out.println("Empty HasMap, creating.");
			initializeTheHashMap();
		}
		Set<Integer> hmMap = getHt1().keySet();
		Iterator<Integer> tempIter = hmMap.iterator();
		while (tempIter.hasNext()) {
			Integer tempInt = (Integer) tempIter.next();
			System.out.println("key/value: " + tempInt + " " + getHt1().get(tempInt));
		}
	}

	private void initializeTheHashMap() {
		HashMap<Integer, String> tempHT = new HashMap<Integer, String>();
		for (int i = 0; i < 20; i++) {
			String tempValue = "~" + new Integer(i);
			tempHT.put(i, tempValue);
		}
		setHt1(tempHT);
	}
	
	private String getByKeyValue(Integer keyIn) {
		
		if (getHt1().containsKey(keyIn)) {
			return getHt1().get(keyIn);
		}
		else {
			return "key used was not found.";
		}
		
		
	}
	
	/**
	 * getters and setters
	 * @return
	 */
	
	
	public HashMap<Integer, String> getHt1() {
		return ht1;
	}

	public void setHt1(HashMap<Integer, String> ht1) {
		this.ht1 = ht1;
	}

}
