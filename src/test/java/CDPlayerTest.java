import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer();
    }

    @Test
    public void cdStartsEmpty(){
        assertEquals(0, cdPlayer.numberOfCDs());
    }

    @Test
    public void canAddCD(){
        cdPlayer.addCD("Hello");
        assertEquals(1, cdPlayer.numberOfCDs());
    }

    @Test
    public void cannotPlaySong(){
        assertEquals("Song not found.", cdPlayer.play("Hello"));
    }

    @Test
    public void canPlaySong(){
        cdPlayer.addCD("Hello");
        assertEquals("Playing: Hello", cdPlayer.play("Hello"));
    }


}
