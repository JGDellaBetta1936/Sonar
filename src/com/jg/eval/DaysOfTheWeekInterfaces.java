package com.jg.eval;

interface DayOfWeek {    
    boolean isWeekend();
}

public enum DaysOfTheWeekInterfaces implements DayOfWeek {
    MONDAY() {
        public boolean isWeekend() {
            return false;
        }
    },
    TUESDAY() {
      
        public boolean isWeekend() {
            return false;
        }
    },
    WEDNESDAY() {
       
        public boolean isWeekend() {
            return false;
        }
    },
    THURSDAY() {
      
        public boolean isWeekend() {
            return false;
        }
    },
    FRIDAY() {
       
        public boolean isWeekend() {
            return false;
        }
    },
    SATURDAY() {
    
        public boolean isWeekend() {
            return true;
        }
    },
    SUNDAY() {
       
        public boolean isWeekend() {
            return true;
        }
    };    
}
