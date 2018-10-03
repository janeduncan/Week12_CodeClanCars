package dealership;

import arnoldcodeclan.dealership.Customer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void setUp() {
        customer = new Customer("Jane", 300000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jane", customer.getName());
    }

    @Test
    public void hasMoney() {
        assertEquals(300000.00, customer.getWallet(), 0.01);
    }

}
