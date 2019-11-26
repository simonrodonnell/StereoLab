import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Roberts", "T-1000" );
    }

    @Test
    public void canGetMake(){
        assertEquals("Roberts", radio.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("T-1000", radio.getModel());
    }

    @Test
    public void canTune(){
        assertEquals("Radio 1", radio.tune("Radio 1"));
    }
}
