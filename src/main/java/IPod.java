public class IPod implements IConnect {

    public String connect(Stereo stereo){
        return "Connected to " + stereo.getName();
    }

}
