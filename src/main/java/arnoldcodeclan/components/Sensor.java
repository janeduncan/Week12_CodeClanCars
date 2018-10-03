package arnoldcodeclan.components;

public abstract class Sensor {

    private String make;
    private String model;

    public Sensor(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

}
