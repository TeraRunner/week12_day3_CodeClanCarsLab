import Components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void setup() {
        engine = new Engine( "Ferrari", "H200", 200);
    }

    @Test
    public void engineTest() {
        assertEquals("Ferrari", engine.getMake());
        assertEquals("H200", engine.getModel());
        assertEquals(200, engine.getPotence());
    }
}
