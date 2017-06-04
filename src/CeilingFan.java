/**
 * Created by Тим on 04.06.2017.
 */
public class CeilingFan {
    String location = "";
    int level;
    public static final int HIGH = 2;
    public static final int MEDIUM = 1;
    public static final int LOW = 0;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        level = HIGH;
        System.out.println(location + " high");

    }

    public void medium() {
        level = MEDIUM;
        System.out.println(location + " medium");
    }

    public void low() {
        level = LOW;
        System.out.println(location + " low");
    }

    public void off() {
        level = 0;
        System.out.println(location + " off");
    }

    public int getSpeed() {
        return level;
    }
}