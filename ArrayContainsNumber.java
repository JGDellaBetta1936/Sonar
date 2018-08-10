package com.jg.eval;

import java.util.Arrays;

import org.apache.log4j.Logger;
public class ArrayContainsNumber {
	static Logger log = Logger.getLogger(ArrayContainsNumber.class.getName());
	private static final String QUESTION1 = "Does array %s has %s?  %b %n";
	private static final String QUESTION2 = "Does array %s contains %s?  %b %n";
	private static final String QUESTION4 = "Does Integer array %s contains %s?  %b %n";
	private static final String QUESTION6 = "Does array of names %s has %s?  %b %n";

	public static void main(String [] arg) {
		
        //test our method to see if array contains a certain value or not
		
		
        Integer[] input = new Integer[]{1, 2, 3, 4, 5};
        
        System.out.printf(QUESTION1, Arrays.toString(input), 5, isExists(input, 5));
        System.out.printf(QUESTION2, Arrays.toString(input), 5, contains(input, 5));
        System.out.printf(QUESTION1, Arrays.toString(input), 6, isExists(input, 6));
        System.out.printf(QUESTION4, Arrays.toString(input), 6, contains(input, 6));

        String[] names = new String[]{"JP", "KP", "RP", "OP", "SP"};
        System.out.printf(QUESTION1, Arrays.toString(names), "JP", isExists(names, "JP"));
        System.out.printf(QUESTION1, Arrays.toString(names), "SP", contains(names, "SP"));
        System.out.printf(QUESTION6, Arrays.toString(names), "MP", isExists(names, "MP"));
        System.out.printf(QUESTION6, Arrays.toString(names), "UP", contains(names, "UP"));

    }

    /**
     * Function to test if Array contains a certain value or not. This method take advantage of
     * contains() method of ArrayList class, by converting array to ArrayList.
     *
     * @return true if array contains 
     */
    public static <T> boolean isExists(final T[] array, final T object) {
        return Arrays.asList(array).contains(object);
    }


   /**
     * Another method to search an item in Java array. This method loop through array and use
     * equals() method to search element. This actually performs a linear search over array in Java
     *
     *@return true if array has provided value.
     */
    public static <T> boolean contains(final T[] array, final T v) {
        for (final T e : array) {
            if (e == v || v != null && v.equals(e)) {
                return true;
            }
        }

        return false;
    }

}
