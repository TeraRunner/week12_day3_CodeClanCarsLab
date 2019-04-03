package Vehicles;

import Components.Engine;
import Components.Tyres;

public abstract class Vehicle {

    private double price;
    private String colour;
    private Tyres tyres;

    public Vehicle(double price, String colour, Tyres tyres) {
        this.price = price;
        this.colour = colour;
        this.tyres = tyres;
    }

    public double getPrice() {
        return this.price;
    }

    public String getColour() {
        return this.colour;
    }

    public Tyres getTyres() {
        return this.tyres;
    }
}
