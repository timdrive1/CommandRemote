/**
 * Created by Тим on 04.06.2017.
 */
public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
    }

    public void undo() {
        stereo.off();
    }
}