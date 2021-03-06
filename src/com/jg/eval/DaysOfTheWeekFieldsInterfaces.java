package com.jg.eval;

public enum DaysOfTheWeekFieldsInterfaces implements DayOfWeek {
    MONDAY( false ),
    TUESDAY( false ),
    WEDNESDAY( false ),
    THURSDAY( false ),
    FRIDAY( false ),
    SATURDAY( true ),
    SUNDAY( true );
    
    private final boolean isWeekend;
    
    private DaysOfTheWeekFieldsInterfaces( final boolean isWeekend ) {
        this.isWeekend = isWeekend;
    }
    
    public boolean isWeekend() {
        return isWeekend;
    }
}
