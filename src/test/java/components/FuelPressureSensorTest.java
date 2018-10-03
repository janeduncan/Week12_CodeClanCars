package components;

import arnoldcodeclan.components.FuelPressureSensor;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FuelPressureSensorTest {

    FuelPressureSensor fuelPressureSensor;

    @Before
    public void setUp() {
        fuelPressureSensor = new FuelPressureSensor("Siemens", "FDU46");
    }

    @Test
    public void hasMake() {
        assertEquals("Siemens", fuelPressureSensor.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("FDU46", fuelPressureSensor.getModel());
    }

}