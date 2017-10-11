
public class Date {
    
    static boolean valid(int day, int month) {
        if (month < 0 && month > 12) {
            return false;
        }
        if (month == 1 && day > 0 && day < 32) {
            return true;
        } else if (month == 2 && day) {
            return false;
        }
    }

}
