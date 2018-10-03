package components;

import arnoldcodeclan.components.Airbag;
import arnoldcodeclan.components.Battery;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BatteryTest {

    Battery battery;

    @Before
    public void setUp() {
        battery = new Battery("Interstate", "D1");
    }

    @Test
    public void hasMake() {
        assertEquals("Interstate", battery.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("D1", battery.getModel());
    }

}
