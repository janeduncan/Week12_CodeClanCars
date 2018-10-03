package vehicles;

import arnoldcodeclan.components.*;
import arnoldcodeclan.vehicles.HybridElectricCar;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridElectricCar hybridElectricCar;
    Tyre tyre;
    Battery battery;
    Airbag airbag;
    ICEngine icEngine;
    FuelPressureSensor fuelPressureSensor;

    @Before
    public void setUp() {
        tyre = new Tyre("Goodyear", "155/70 R19 84Q", "Winter");
        battery = new Battery("Interstate", "D1");
        airbag = new Airbag("Delphi", "TM100");
        icEngine = new ICEngine("Siemens", "BD83659");
        fuelPressureSensor = new FuelPressureSensor("Siemens", "FDU46");
        ArrayList tyres = new ArrayList<>();
        tyres.add(tyre);
        tyres.add(tyre);
        tyres.add(tyre);
        tyres.add(tyre);
        hybridElectricCar = new HybridElectricCar("Hyundai", "Ioniq", tyres, battery, airbag, fuelPressureSensor, icEngine);
        hybridElectricCar.setPrice(24000.00);
    }

    @Test
    public void hasMake() {
        assertEquals("Hyundai", hybridElectricCar.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Ioniq", hybridElectricCar.getModel());
    }

    @Test
    public void hasTyres() {
        assertEquals(4, hybridElectricCar.getTyres().size());
    }

    @Test
    public void hasBattery() {
        assertEquals(battery, hybridElectricCar.getBattery());
    }

    @Test
    public void hasAirbag() {
        assertEquals(airbag, hybridElectricCar.getAirbag());
    }

    @Test
    public void hasPrice() {
        assertEquals(24000.00, hybridElectricCar.getPrice(), 0.01);
    }

    @Test
    public void canSetPrice() {
        hybridElectricCar.setPrice(30000.00);
        assertEquals(30000.00, hybridElectricCar.getPrice(), 0.01);
    }

    @Test
    public void hasEngine() {
        assertEquals(icEngine, hybridElectricCar.getICEngine());
    }

}
