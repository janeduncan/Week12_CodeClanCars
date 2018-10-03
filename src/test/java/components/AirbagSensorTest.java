package components;

import arnoldcodeclan.components.AirbagSensor;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AirbagSensorTest {

    AirbagSensor airbagSensor;

    @Before
    public void setUp() {
        airbagSensor = new AirbagSensor("Siemens", "S234");
    }

    @Test
    public void hasMake() {
        assertEquals("Siemens", airbagSensor.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("S234", airbagSensor.getModel());
    }

}
