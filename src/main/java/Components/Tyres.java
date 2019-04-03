package Components;

public class Tyres {

    private String make;
    private String model;
    private int numberOfTyres;

    public Tyres(String make, String model, int numberOfTyres) {
        this.make = make;
        this.model = model;
        this.numberOfTyres = numberOfTyres;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getNumberOfTyres() {
        return this.numberOfTyres;
    }

}
