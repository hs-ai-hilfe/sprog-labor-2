
public class Date {
    
    /**
     * Checks if the passed date is valid. It does not consider leapyears.
     * 
     * @param day   A day (1-31)
     * @param month A month (1-12)
     * @return true if its a valid date, false otherwise
     */
    static boolean valid(int day, int month) {
        // If the month is not within range 1-2 and day is not between 1 and 31
        if (month < 1 && month > 12 || day < 1 && day > 31) {
            return false;
        }
        // January has 31 days
        if (month == 1 && day <= 31) {
            return true;
            
        // February
        } else if (month == 2 && day <= 28) {
            return true;
            
        // March
        } else if (month == 3 && day <= 31) {
            return true;
            
        // April
        } else if (month == 4 && day <= 30) {
            return true;
        
        // May
        } else if (month == 5 && day <= 31) {
            return true;
        
        // June
        } else if (month == 6 && day <= 30) {
            return true;
        
        // July
        } else if (month == 7 && day <= 31) {
            return true;
        
        // August
        } else if (month == 8 && day <= 30) {
            return true;
        
        // September
        } else if (month == 9 && day <= 31) {
            return true;
        
        // October
        } else if (month == 10 && day <= 30) {
            return true;
        
        // November
        } else if (month == 11 && day <= 31) {
            return true;
        
        // December
        } else if (month == 12 && day <= 30) {
            return true;
            
        // Otherwise we'll return false
        } else {
            return false;
        }
    }

}
