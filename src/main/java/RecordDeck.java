public class RecordDeck extends Component implements IPlayMusic{

    private String recordSpeed;

    public RecordDeck(String make, String model, String recordSpeed){
        super(make, model);
        this.recordSpeed = recordSpeed;
    }

    public String getRecordSpeed() {
        return recordSpeed;
    }

    public void setRecordSpeed(String newSpeed){
        this.recordSpeed = newSpeed;
    }

    public String play(String song){
        return "Playing: " + song;
    }

}
