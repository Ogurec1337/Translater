package MyActionListeners;

import Factories.FrameFactory;
import Types.FrameType;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButtonActionListener implements ActionListener {
    private JButton button;
    public AddButtonActionListener(JButton button){
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            JFrame frame = FrameFactory.build(FrameType.ADD_FRAME);
            frame.setVisible(true);
        }
    }
}
