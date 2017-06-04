/**
 * Created by Тим on 04.06.2017.
 */
public class Stereo {
    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " стерео вкл");
    }

    public void off() {
        System.out.println(location + " стерео выкл");
    }

    public void setCD() {
        System.out.println(location + " цд");
    }

    public void setDVD() {
        System.out.println(location + " двд");
    }

    public void setRadio() {
        System.out.println(location + "радио");
    }

    public void setVolume(int volume) {
        System.out.println(location + " громкость " + volume);
    }
}