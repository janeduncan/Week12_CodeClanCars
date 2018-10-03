package dealership;

import arnoldcodeclan.components.*;
import arnoldcodeclan.dealership.Customer;
import arnoldcodeclan.dealership.Dealer;
import arnoldcodeclan.dealership.Dealership;
import arnoldcodeclan.dealership.Till;
import arnoldcodeclan.vehicles.BatteryElectricCar;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class DealershipTest {

    Dealership dealership;
    Till till;
    Dealer dealer;
    Customer customer;
    BatteryElectricCar batteryElectricCar;
    Tyre tyre;
    Battery battery;
    Airbag airbag;
    ElectricMotor electricMotor;
    AirbagSensor airbagSensor;

    @Before
    public void setUp() {

        // Till
        till = new Till(1000.00);

        // Dealership
        dealership = new Dealership(till);

        // Dealer
        dealer = new Dealer("Slimy car dealer", 3.50);
        dealership.addDealer(dealer);

        //Customers
        customer = new Customer("Jane", 300000.00);
        dealership.addCustomer(customer);

        // Battery Electric Car
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
        dealership.addStock(batteryElectricCar);
    }

    @Test
    public void hasTill() {
        assertEquals(till, dealership.getTill());
    }

    @Test
    public void hasDealer() {
        assertEquals(1, dealership.getDealers().size());
    }

    @Test
    public void hasCustomers() {
        assertEquals(1, dealership.getCustomers().size());
    }

    @Test
    public void hasStock() {
        assertEquals(1, dealership.getStock().size());
    }

    @Test
    public void canAddDealer() {
        Dealer dealer = new Dealer("Another slimy car dealer", 3.50);
        dealership.addDealer(dealer);
        assertEquals(2, dealership.getDealers().size());
    }

    @Test
    public void canAddCustomer() {
        Customer customer = new Customer("Ross", 25000.00);
        dealership.addCustomer(customer);
        assertEquals(2, dealership.getCustomers().size());
    }

    @Test
    public void canAddStock() {
        dealership.addStock(batteryElectricCar);
        assertEquals(2, dealership.getStock().size());
    }

}
