package dealership;

import arnoldcodeclan.dealership.Till;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TillTest {

    Till till;

    @Before
    public void setUp() {
        till = new Till(1000.00);
    }

    @Test
    public void hasMoneyInTill() {
        assertEquals(1000.00, till.getTotal(), 0.01);
    }

}
