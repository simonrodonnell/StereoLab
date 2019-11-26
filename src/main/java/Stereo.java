public class Stereo {

    CDPlayer cdPlayer;
    RecordDeck recordDeck;
    Radio radio;
    String name;
    int volume;

    public Stereo(
            CDPlayer cdPlayer,
            RecordDeck recordDeck,
            Radio radio,
            String name){
        this.cdPlayer = cdPlayer;
        this.recordDeck = recordDeck;
        this.radio = radio;
        this.name = name;
        this.volume = 5;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String play(IPlayMusic component, String song){
        return component.play(song);
    }

    public void addCD(String cd){
        cdPlayer.addCD(cd);
    }

    public String tuneRadio(String station){
        return radio.tune(station);
    }

    public void changeRecordSpeed(String speed){
        recordDeck.setRecordSpeed(speed);
    }

    public void increaseVolume(){
        this.volume ++;
    }
    public void decreaseVolume(){
        this.volume --;
    }

}
