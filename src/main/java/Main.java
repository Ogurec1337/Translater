import Factories.FrameFactory;
import Factories.MyLabelFactory;
import Factories.MyTextfieldFactory;
import Types.FrameType;
import Types.LabelType;
import Types.TextfieldType;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = FrameFactory.build(FrameType.MAIN_FRAME);
        JTextField field = MyTextfieldFactory.build(TextfieldType.MAIN_FRAME_FIELD);
        JLabel label = MyLabelFactory.build(LabelType.MAIN_FRAME_TYPE);
        frame.add(field);
        frame.add(label);
        label.setText("huesos");
        frame.setVisible(true);
    }
}
