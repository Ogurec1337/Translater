package MyActionListeners;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TextfieldActionListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar() == '\n')
            System.out.println("yeap");
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
