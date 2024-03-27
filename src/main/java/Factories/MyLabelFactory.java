package Factories;

import Types.LabelType;
import Utils.Properties;

import javax.swing.*;
import java.awt.*;

public class MyLabelFactory {
    private static final Dimension MAIN_FRAME_LABEL_DIMENSION = new Dimension(220,80);
    private static final Point MAIN_LOCATION = new Point(
            (int) (Properties.MAIN_FRAME_DIMENSION.getWidth()/2 - MAIN_FRAME_LABEL_DIMENSION.getWidth()/2-3),
            (int) (Properties.MAIN_FRAME_DIMENSION.getHeight()/4));
    private MyLabelFactory(){}
    public static JLabel build(LabelType type) {
        JLabel label = new JLabel();
        switch (type) {
            case MAIN_FRAME_TYPE:
                label.setSize(MAIN_FRAME_LABEL_DIMENSION);
                label.setBackground(Properties.SECOND_COLOR);
                label.setForeground(Properties.MAIN_COLOR);
                label.setLocation(MAIN_LOCATION);
                label.setFont(Properties.MAIN_FONT);
                label.setHorizontalAlignment(SwingConstants.CENTER);
                label.setOpaque(true);

        }
        return label;
    }
}
