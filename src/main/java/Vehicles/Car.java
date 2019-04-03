package Vehicles;

import Components.Engine;
import Components.Tyres;

public class Car extends Vehicle{

    private Engine engine;

    public Car(double price, String colour, Engine engine, Tyres tyres) {
        super(price, colour, tyres);
        this.engine = engine;
    }

    public int getEnginePotence() {
        return this.engine.getPotence();
    }

}
