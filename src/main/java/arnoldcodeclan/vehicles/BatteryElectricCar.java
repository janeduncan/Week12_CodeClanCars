package arnoldcodeclan.vehicles;
import arnoldcodeclan.components.*;

import java.util.ArrayList;

public class BatteryElectricCar extends Vehicle {

    private ElectricMotor electricMotor;

    public BatteryElectricCar(String make, String model, ArrayList<Tyre> tyres, Battery battery, Airbag airbag, Sensor sensor, ElectricMotor electricMotor) {
        super(make, model, tyres, battery, airbag, sensor);
        this.electricMotor = electricMotor;
    }

    public ElectricMotor getElectricMotor() {
        return electricMotor;
    }

}
