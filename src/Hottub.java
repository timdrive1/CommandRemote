/**
 * Created by Тим on 04.06.2017.
 */
public class Hottub {
    boolean on;
    int temperature;

    public Hottub() {
    }

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    public void bubblesOn() {
        if (on) {
            System.out.println("хотуб кипит");
        }
    }

    public void bubblesOff() {
        if (on) {
            System.out.println("хотуб не кипит");
        }
    }

    public void jetsOn() {
        if (on) {
            System.out.println("хотуб вкл");
        }
    }

    public void jetsOff() {
        if (on) {
            System.out.println("хотуб выкл");
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void heat() {
        temperature = 105;
        System.out.println("хотуб испаряется при 105");
    }

    public void cool() {
        temperature = 98;
        System.out.println("хотуб остывает при 98");
    }

}