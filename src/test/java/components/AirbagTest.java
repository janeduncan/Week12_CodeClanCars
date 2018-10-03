package components;

import arnoldcodeclan.components.Airbag;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AirbagTest {

    Airbag airbag;

    @Before
    public void setUp() {
        airbag = new Airbag("Delphi", "TM100");
    }

    @Test
    public void hasMake() {
        assertEquals("Delphi", airbag.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("TM100", airbag.getModel());
    }

}
