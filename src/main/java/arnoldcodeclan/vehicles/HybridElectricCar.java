package arnoldcodeclan.vehicles;
import arnoldcodeclan.components.*;

import java.util.ArrayList;

public class HybridElectricCar extends Vehicle {

    private ICEngine ICEngine;

    public HybridElectricCar(String make, String model, ArrayList<Tyre> tyres, Battery battery, Airbag airbag, Sensor sensor, ICEngine ICEngine) {
        super(make, model, tyres, battery, airbag, sensor);
        this.ICEngine = ICEngine;
    }

    public arnoldcodeclan.components.ICEngine getICEngine() {
        return ICEngine;
    }
}