import Shop.Customer;
import Shop.Dealer;
import Shop.Till;
import Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private Dealer dealer;
    private Till till;
    private Customer customer;
    private ArrayList<Vehicle> stockOfCars;

    public Dealership() {
        stockOfCars = new ArrayList<>();
        this.till = till;
        this.dealer = dealer;
    }

}
