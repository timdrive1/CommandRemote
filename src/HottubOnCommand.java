/**
 * Created by Тим on 04.06.2017.
 */
public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }
    public void execute() {
        hottub.on();
        hottub.setTemperature(104);
        hottub.bubblesOn();
    }
    public void undo() {
        hottub.off();
    }
}