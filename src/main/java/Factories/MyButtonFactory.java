package Factories;

import MyActionListeners.AddButtonActionListener;
import Types.ButtonType;
import Utils.Properties;

import javax.swing.*;
import java.awt.*;

public class MyButtonFactory {
    private static final Dimension ADD_BUTTON_DIMENSION = new Dimension(40,30);
    private MyButtonFactory(){}
    public static JButton build(ButtonType type){
        JButton button = new JButton();
        switch(type) {
            case ADD_BUTTON:
            button.setSize(ADD_BUTTON_DIMENSION);
            button.setFocusable(false);
            button.setLocation((int) (Properties.MAIN_FRAME_DIMENSION.getWidth() - 60), 10);
            button.setBorder(BorderFactory.createLineBorder(Properties.SECOND_COLOR));
            button.setBackground(Properties.MAIN_COLOR);
            button.setForeground(Properties.SECOND_COLOR);
            button.setFont(new Font("Dialog",Font.TRUETYPE_FONT,20));
            button.setText("+");
            button.addActionListener(new AddButtonActionListener(button));
        }
        return button;
    }
}
