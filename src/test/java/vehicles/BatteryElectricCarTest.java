package vehicles;

import arnoldcodeclan.components.*;
import arnoldcodeclan.vehicles.BatteryElectricCar;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BatteryElectricCarTest {

    BatteryElectricCar batteryElectricCar;
    Tyre tyre;
    Battery battery;
    Airbag airbag;
    ElectricMotor electricMotor;
    AirbagSensor airbagSensor;

    @Before
    public void setUp() {
        tyre = new Tyre("Goodyear", "155/70 R19 84Q", "Winter");
        battery = new Battery("Interstate", "D1");
        airbag = new Airbag("Delphi", "TM100");
        electricMotor = new ElectricMotor("Siemens", "ED83659");
        airbagSensor = new AirbagSensor("Siemens", "AX");
        ArrayList tyres = new ArrayList<>();
        tyres.add(tyre);
        tyres.add(tyre);
        tyres.add(tyre);
        tyres.add(tyre);
        batteryElectricCar = new BatteryElectricCar("BMW", "i3", tyres, battery, airbag, airbagSensor, electricMotor);
        batteryElectricCar.setPrice(24000.00);
    }

    @Test
    public void hasMake() {
        assertEquals("BMW", batteryElectricCar.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("i3", batteryElectricCar.getModel());
    }

    @Test
    public void hasTyres() {
        assertEquals(4, batteryElectricCar.getTyres().size());
    }

    @Test
    public void hasBattery() {
        assertEquals(battery, batteryElectricCar.getBattery());
    }

    @Test
    public void hasAirbag() {
        assertEquals(airbag, batteryElectricCar.getAirbag());
    }

    @Test
    public void hasAirbagSensor() {
        assertEquals(airbagSensor, batteryElectricCar.getSensor());
    }

    @Test
    public void hasPrice() {
        assertEquals(24000.00, batteryElectricCar.getPrice(), 0.01);
    }

    @Test
    public void canSetPrice() {
        batteryElectricCar.setPrice(30000.00);
        assertEquals(30000.00, batteryElectricCar.getPrice(), 0.01);
    }

    @Test

    public void hasElectricMotor() {
        assertEquals(electricMotor, batteryElectricCar.getElectricMotor());
    }

}
