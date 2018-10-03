package components;

import arnoldcodeclan.components.Airbag;
import arnoldcodeclan.components.Battery;
import arnoldcodeclan.components.ElectricMotor;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ElectricMotorTest {

    ElectricMotor electricMotor;

    @Before
    public void setUp() {
        electricMotor = new ElectricMotor("Siemens", "ED83659");
    }

    @Test
    public void hasMake() {
        assertEquals("Siemens", electricMotor.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("ED83659", electricMotor.getModel());
    }

}
