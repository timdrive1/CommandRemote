/**
 * Created by Тим on 04.06.2017.
 */
public class TV {
    String location;
    int channel;
    public TV(String location) {
        this.location = location;
    }
    public void on() {
        System.out.println("зомбоящик вкл");
    }
    public void off() {
        System.out.println("из окна....");
    }
    public void setInputChannel() {
        this.channel = 1;
        System.out.println("ваш первый канал");
    }
}