package dealership;
import arnoldcodeclan.dealership.Dealer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;

    @Before
    public void setUp() {
        dealer = new Dealer("Slimy car dealer", 3.50);
    }

    @Test
    public void hasName() {
        assertEquals("Slimy car dealer", dealer.getName());
    }

    @Test
    public void hasCommissionRate() {
        assertEquals(3.50, dealer.getCommissionRate(), 0.01);
    }

    @Test
    public void canSetCommissionRate() {
        dealer.setCommissionRate(2.80);
        assertEquals(2.80, dealer.getCommissionRate(), 0.01);
    }

    @Test
    public void totalCommissionStartsAtZero() {
        assertEquals(0, dealer.getTotalCommission(), 0.01);
    }

    @Test
    public void canAddCommission() {
        dealer.addCommission(100.00);
        assertEquals(100.00, dealer.getTotalCommission(), 0.01);
    }

}
