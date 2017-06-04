/**
 * Created by Тим on 04.06.2017.
 */
public class GarageDoor {
    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + " подняты двери гаража");
    }

    public void down() {
        System.out.println(location + " опущены двери гаража");
    }

    public void stop() {
        System.out.println(location + " остановлены двери гаража");
    }

    public void lightOn() {
        System.out.println(location + " свет в гараже вкл");
    }

    public void lightOff() {
        System.out.println(location + " свет в гараже выкл");
    }
}