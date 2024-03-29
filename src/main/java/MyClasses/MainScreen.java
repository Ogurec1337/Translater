package MyClasses;

import javax.swing.*;
//singleton
public class Main_screen {
    private static JLabel main_label;
    public Main_screen(JLabel label){
        if(main_label == null)
            main_label = label;
    }
    public static void showMessage(String message){
        main_label.setText(message);
    }

}
