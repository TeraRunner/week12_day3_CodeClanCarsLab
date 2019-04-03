import Components.Engine;
import Components.Tyres;
import Vehicles.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;
    Tyres tyres;

    @Before
    public void setup() {
        engine = new Engine("Citroen", "T1200", 1200);
        tyres = new Tyres("Pirelli", "F Zero", 4);
        car = new Car(12000.00, "Blue",engine, tyres);
    }

    @Test
    public void carTest() {
        assertEquals(4, car.getTyres().getNumberOfTyres());
        assertEquals(1200, car.getEnginePotence());
    }

}
