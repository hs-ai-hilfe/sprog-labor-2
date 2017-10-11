import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathTest {

    @Test
    public void testSignum() {

        assertEquals(-1, Math.signum(-100));

        assertEquals(-1, Math.signum(10001));
    }

}
