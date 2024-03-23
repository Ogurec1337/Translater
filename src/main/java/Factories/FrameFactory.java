package Factories;

import Types.ButtonType;
import Types.FrameType;
import Types.LabelType;
import Types.TextfieldType;
import Utils.Properties;

import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class FrameFactory {
    private FrameFactory(){}
    public static JFrame build(FrameType type){
        JFrame frame = new JFrame();


        frame.setResizable(false);
        switch(type){
            case MAIN_FRAME:
                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                frame.setSize(Properties.MAIN_FRAME_DIMENSION);
                frame.getContentPane().setBackground(Properties.MAIN_COLOR);
                    JTextField field = MyTextfieldFactory.build(TextfieldType.MAIN_FRAME_FIELD);
                    JLabel label = MyLabelFactory.build(LabelType.MAIN_FRAME_TYPE);
                    JButton button = MyButtonFactory.build(ButtonType.ADD_BUTTON);
                frame.add(field);
                frame.add(label);
                frame.add(button);

                label.setText("huesos");
                break;
            case ADD_FRAME:
                frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                frame.setSize(Properties.ADD_FRAME_DIMENSION);
                frame.getContentPane().setBackground(Properties.SECOND_COLOR);
                break;
        }

        frame.setLocationRelativeTo(null);
        frame.setLayout(null);


        return frame;
    }

}
