import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathTest {

    /**
     * Tests if {@link Math#signum(int)} returns -1 for negative numbers
     */
    @Test
    public void testNegativeNumber() {
        assertEquals(-1, Math.signum(-100));
        assertEquals(-1, Math.signum(-456456));
        assertEquals(-1, Math.signum(-823460));
    }
    
    /**
     * Tests if {@link Math#signum(int)} return 1 for positive numbers
     */
    @Test
    public void testPositiveNumber() {
        assertEquals(1, Math.signum(456456));
        assertEquals(1, Math.signum(945692));
        assertEquals(1, Math.signum(2912));
    }
    
    /**
     * Tests if {@link Math#signum(int)} return 0 for 0
     */
    @Test
    public void testZero() {
        assertEquals(0, Math.signum(0));
    }

}
