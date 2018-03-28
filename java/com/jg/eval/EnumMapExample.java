package com.jg.eval;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {
	
	private EnumMapExample () {
		
	}
    public static void main(String[] args) {
        final Map< DaysOfTheWeek, String > enumMap = new EnumMap<DaysOfTheWeek, String>( DaysOfTheWeek.class );               
        enumMap.put( DaysOfTheWeek.MONDAY, "Lundi" );
        enumMap.put( DaysOfTheWeek.TUESDAY, "Mardi" );
        // Some implementation here
    }
}
