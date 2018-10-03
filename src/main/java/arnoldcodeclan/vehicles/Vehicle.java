package arnoldcodeclan.vehicles;
import arnoldcodeclan.components.Airbag;
import arnoldcodeclan.components.Battery;
import arnoldcodeclan.components.Tyre;
import arnoldcodeclan.components.Sensor;

import java.util.ArrayList;

public abstract class Vehicle {

    private String make;
    private String model;
    private ArrayList<Tyre> tyres;
    private Battery battery;
    private Airbag airbag;
    private double price;
    private Sensor sensor;

    public Vehicle(String make, String model, ArrayList<Tyre> tyres, Battery battery, Airbag airbag, Sensor sensor) {
        this.make = make;
        this.model = model;
        this.tyres = tyres;
        this.battery = battery;
        this.airbag = airbag;
        this.price = 0.00;
        this.sensor = sensor;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public ArrayList<Tyre> getTyres() {
        return tyres;
    }

    public Battery getBattery() {
        return battery;
    }

    public Airbag getAirbag() {
        return airbag;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
