import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck("33.3");
    }

    @Test
    public void canGetRecordSpeed(){
        assertEquals("33.3", recordDeck.getRecordSpeed());
    }

    @Test
    public void canChangeSpeed(){
        recordDeck.setRecordSpeed("45");
        assertEquals("45", recordDeck.getRecordSpeed());
    }

    @Test
    public void canPlay(){
        assertEquals("Playing: Hello", recordDeck.play("Hello"));
    }
}
