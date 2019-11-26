public class RecordDeck implements IPlayMusic{

    private String recordSpeed;

    public RecordDeck(String recordSpeed){
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
