
public class Math {
    
    /**
     * Takes an integer and determinates if the passed number is positiv/negative
     * 
     * @param value The value to be checked
     * @return -1 if a negative number was passed, 1 if its positive, 0 if its zero
     */
    static int signum(int value) {
        if (value > 0) {
            return 1;
        } else if (value < 0){
            return -1;
        } else {
            return 0;
        }
    }

}
