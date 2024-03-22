package Factories;

import Types.TextfieldType;

import javax.swing.*;

public class MyTextfieldFactory {
    private MyTextfieldFactory(){}
    public static JTextField build(TextfieldType type){
        JTextField field = new JTextField();
        switch(type){
            case MAIN_FRAME_FIELD:
                break;

        }

    }
}
