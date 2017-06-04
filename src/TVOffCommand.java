/**
 * Created by Тим on 04.06.2017.
 */
public class TVOffCommand implements Command {
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv= tv;
    }

    public void execute() {
        tv.off();
    }

    public void undo() {
        tv.on();
    }
}