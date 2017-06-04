/**
 * Created by Тим on 04.06.2017.
 */
public class Light {
    String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " свет вкл");
    }

    public void off() {
        System.out.println(location + " свет выкл");
    }
}