package components;

import arnoldcodeclan.components.ICEngine;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ICEngineTest {

    ICEngine icEngine;

    @Before
    public void setUp() {
        icEngine = new ICEngine("Siemens", "BD83659");
    }

    @Test
    public void hasMake() {
        assertEquals("Siemens", icEngine.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("BD83659", icEngine.getModel());
    }

}
