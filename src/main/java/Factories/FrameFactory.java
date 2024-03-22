package Factories;

import Types.FrameType;
import Utils.Properties;

import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class FrameFactory {
    private FrameFactory(){}
    public static JFrame build(FrameType type){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        frame.setResizable(false);
        switch(type){
            case MAIN_FRAME:
                frame.setSize(Properties.MAIN_FRAME_DIMENSION);
                frame.getContentPane().setBackground(Properties.MAIN_COLOR);
                break;
            case ADD_FRAME:
                break;
        }

        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        return frame;


    }
}
