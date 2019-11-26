import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IPodTest {

    Stereo stereo;
    CDPlayer cdPlayer;
    RecordDeck recordDeck;
    Radio radio;
    IPod iPod;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Sony", "DiscMan");
        recordDeck = new RecordDeck("Sony", "R2-D2", "33.3");
        radio = new Radio("Roberts", "T-1000" );
        stereo = new Stereo(cdPlayer, recordDeck, radio, "Bill");
        iPod = new IPod();
    }

    @Test
    public void canConnect(){
        assertEquals("Connected to Bill", iPod.connect(stereo));
    }
}
