import Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void setup() {
        tyres = new Tyres("Pirelli", "P Zero", 4);
    }

    @Test
    public void tyresTest() {
        assertEquals("Pirelli", tyres.getMake());
        assertEquals("P Zero", tyres.getModel());
        assertEquals(4, tyres.getNumberOfTyres());
    }

}
