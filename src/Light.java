/**
 * Created by Тим on 04.06.2017.
 */
public class Light {
    String location;
    int level;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " свет вкл");
    }

    public void off() {
        System.out.println(location + " свет выкл");
    }
    public void dim(int level) {
        this.level = level;
        if (level == 0) {
            off();
        }
        else {
            System.out.println("задать на " + level + "%");
        }
    }

    public int getLevel() {
        return level;
    }
}
