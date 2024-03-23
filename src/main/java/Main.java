import Factories.FrameFactory;
import Types.FrameType;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = FrameFactory.build(FrameType.MAIN_FRAME);
        frame.setVisible(true);
    }
}
