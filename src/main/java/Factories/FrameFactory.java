package Factories;

import Types.*;
import Utils.LanguageCheck;
import Utils.Properties;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
                    JTextField field1 = MyTextfieldFactory.build(TextfieldType.MAIN_FRAME_FIELD);
                    JLabel label = MyLabelFactory.build(LabelType.MAIN_FRAME_TYPE);
                    JButton button1 = MyButtonFactory.build(ButtonType.ADD_BUTTON);
                frame.add(field1);
                frame.add(label);
                frame.add(button1);

                label.setText("huesos");
                break;
            case ADD_FRAME:
                frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                frame.setSize(Properties.ADD_FRAME_DIMENSION);
                frame.getContentPane().setBackground(Properties.SECOND_COLOR);
                JTextField field21 = MyTextfieldFactory.build(TextfieldType.ADD_FRAME_FIELD);
                JTextField field22 = MyTextfieldFactory.build(TextfieldType.ADD_FRAME_FIELD);
                field22.setLocation(field22.getX(),60);
                JButton confirm_button = MyButtonFactory.build(ButtonType.CONFIRM_BUTTON);
                confirm_button.setLocation((int) (Properties.ADD_FRAME_DIMENSION.getWidth()/2-confirm_button.getWidth()/2-5),120);
                confirm_button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(e.getSource()==confirm_button){
                            Language first = LanguageCheck.check(field21.getText());
                            Language second = LanguageCheck.check(field22.getText());
                            if(first == Language.NONE || second == Language.NONE || first == second) {
                                JOptionPane.showMessageDialog(null, "wrong input", "warning", JOptionPane.WARNING_MESSAGE);
                                field21.setText("");
                                field22.setText("");
                            }
                            else {
                                try {
                                    String english = first == Language.ENGLISH?field21.getText():field22.getText();
                                    String russian = first == Language.RUSSIAN?field21.getText():field22.getText();
                                    Class.forName("org.postgresql.Driver");
                                    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Translater","postgres","helloWRLD");
                                    Statement st = connection.createStatement();
                                    st.executeUpdate("INSERT INTO translations (english,russian)"+
                                            "VALUES('"+english+"','"+russian+"')");
                                } catch (ClassNotFoundException ex) {
                                    throw new RuntimeException(ex);
                                } catch (SQLException ex) {
                                    throw new RuntimeException(ex);
                                }

                                frame.dispose();
                            }

                        }
                    }
                });

                frame.add(confirm_button);
                frame.add(field22);
                frame.add(field21);
                break;
        }

        frame.setLocationRelativeTo(null);
        frame.setLayout(null);


        return frame;
    }

}
