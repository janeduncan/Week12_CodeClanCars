package arnoldcodeclan.components;

public class Tyre {

    private String make;
    private String model;
    private String season;

    public Tyre(String make, String model, String season) {
        this.make = make;
        this.model = model;
        this.season = season;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getSeason() {
        return season;
    }

}
