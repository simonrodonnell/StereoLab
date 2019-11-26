import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    CDPlayer cdPlayer;
    RecordDeck recordDeck;
    Radio radio;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Sony", "DiscMan");
        recordDeck = new RecordDeck("Sony", "R2-D2", "33.3");
        radio = new Radio("Roberts", "T-1000" );
        stereo = new Stereo(cdPlayer, recordDeck, radio, "Bill");
    }

    @Test
    public void canGetVolume(){
        assertEquals(5, stereo.getVolume());
    }

    @Test
    public void canGetName(){
        assertEquals("Bill", stereo.getName());
    }

    @Test
    public void canPlaySong(){
        assertEquals("Playing: Hello", stereo.play(recordDeck, "Hello"));
    }

    @Test
    public void canAddCD(){
        stereo.addCD("Hello");
        assertEquals(1, cdPlayer.numberOfCDs());
    }

    @Test
    public void canTuneRadio(){
        assertEquals("Radio 1", stereo.tuneRadio("Radio 1"));
    }

    @Test
    public void canIncreaseVolume(){
        stereo.increaseVolume();
        assertEquals(6, stereo.getVolume());
    }

    @Test
    public void canDecreaseVolume(){
        stereo.decreaseVolume();
        assertEquals(4, stereo.getVolume());
    }

}
