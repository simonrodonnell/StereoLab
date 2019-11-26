import java.util.ArrayList;

public class CDPlayer extends Component implements IPlayMusic{

    ArrayList<String> compactDiscs;

    public CDPlayer(String make, String model){
        super(make, model);
        compactDiscs = new ArrayList<String>();
    }

    public int numberOfCDs() {
        return this.compactDiscs.size();
    }

    public String play(String song) {
        if(compactDiscs.contains(song))
        {
        return "Playing: " + song;
        }
        return "Song not found.";
    }

    public void addCD(String newCD) {
        compactDiscs.add(newCD);
    }
}
