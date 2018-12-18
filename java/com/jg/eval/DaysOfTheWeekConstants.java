package com.jg.eval;

public class DaysOfTheWeekConstants {
    public static final int MONDAY = 0;
    public static final int TUESDAY = 1;
    public static final int WEDNESDAY = 2;
    public static final int THURSDAY = 3;
    public static final int FRIDAY = 4;
    public static final int SATURDAY = 5;
    public static final int SUNDAY = 6;
    
    private DaysOfTheWeekConstants() {
    	
    }
    public static boolean isWeekend( int day ) {
        return day == SATURDAY || day == SUNDAY; 
    }
}
