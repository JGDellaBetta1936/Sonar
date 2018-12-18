package com.jg.eval;

public enum DaysOfTheWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    
    public static boolean isWeekend( DaysOfTheWeek day ) {

        return day == SATURDAY || day == SUNDAY;
    }
}
