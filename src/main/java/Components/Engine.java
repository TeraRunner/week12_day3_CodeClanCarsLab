package Components;

public class Engine {

    private String make;
    private String model;
    private int potence;

    public Engine(String make, String model, int potence) {
        this.make = make;
        this.model = model;
        this.potence = potence;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getPotence() {
        return this.potence;
    }

}
