package com.jg.eval;

import org.apache.log4j.Logger;

public class FindMissingNumber {


	
	static Logger log = Logger.getLogger(FindMissingNumber.class.getName());
      
    /* program to test above function */
    public static void main(String [] args)
    {
        int [] a = {1,2,4,5,6,7,9,10};
        int miss = getMissingNo(a,5);
        log.info(miss);   
    }
    
 // Function to ind missing number
    static int getMissingNo (int [] a, int n)
    {
        int i;
        int total;
        total  = (n+1)*(n+2)/2;   
        for ( i = 0; i< n; i++)
           total -= a[i];
        return total;
    }

}
