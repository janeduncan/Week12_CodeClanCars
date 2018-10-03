package vehicles;

import arnoldcodeclan.components.*;
import arnoldcodeclan.vehicles.NormalCar;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class NormalCarTest {

    NormalCar normalCar;
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
        normalCar = new NormalCar("BMW", "X5", tyres, battery, airbag, fuelPressureSensor, icEngine);
        normalCar.setPrice(24000.00);
    }

    @Test
    public void hasMake() {
        assertEquals("BMW", normalCar.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("X5", normalCar.getModel());
    }

    @Test
    public void hasTyres() {
        assertEquals(4, normalCar.getTyres().size());
    }

    @Test
    public void hasBattery() {
        assertEquals(battery, normalCar.getBattery());
    }

    @Test
    public void hasAirbag() {
        assertEquals(airbag, normalCar.getAirbag());
    }

    @Test
    public void hasFuelPressureSensor() {
        assertEquals(fuelPressureSensor, normalCar.getSensor());
    }

    @Test
    public void hasPrice() {
        assertEquals(24000.00, normalCar.getPrice(), 0.01);
    }

    @Test
    public void canSetPrice() {
        normalCar.setPrice(30000.00);
        assertEquals(30000.00, normalCar.getPrice(), 0.01);
    }

    @Test
    public void hasEngine() {
        assertEquals(icEngine, normalCar.getICEngine());
    }

}