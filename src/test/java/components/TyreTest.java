package components;

import arnoldcodeclan.components.ICEngine;
import arnoldcodeclan.components.Tyre;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void setUp() {
        tyre = new Tyre("Goodyear", "155/70 R19 84Q", "Winter");
    }

    @Test
    public void hasMake() {
        assertEquals("Goodyear", tyre.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("155/70 R19 84Q", tyre.getModel());
    }

    @Test
    public void hasSeson() {
        assertEquals("Winter", tyre.getSeason());
    }

}
