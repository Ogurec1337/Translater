package Factories;

import Types.TextfieldType;
import Utils.Properties;

import javax.swing.*;
import java.awt.*;

public class MyTextfieldFactory {
    private static final Dimension MAIN_DIMENSION = new Dimension(150,30);
    private MyTextfieldFactory(){}
    public static JTextField build(TextfieldType type){
        JTextField field = new JTextField();

        switch(type){
            case MAIN_FRAME_FIELD:
                Point point = new Point(
                    (int) (Properties.MAIN_FRAME_DIMENSION.getWidth()/2-MAIN_DIMENSION.getWidth()/2-5),
                    (int) (2*Properties.MAIN_FRAME_DIMENSION.getHeight()/3)
                );

                field.setBackground(Properties.MAIN_COLOR);
                field.setBorder(BorderFactory.createLineBorder(Properties.SECOND_COLOR,2));
                field.setForeground(Properties.SECOND_COLOR);
                field.setFont(Properties.MAIN_FONT);
                field.setSize(MAIN_DIMENSION);
                field.setLocation(point);
                break;

        }

        return field;
    }
}
