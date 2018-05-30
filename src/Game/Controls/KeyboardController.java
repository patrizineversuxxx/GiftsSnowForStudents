package Game.Controls;

import Game.Drawing.Objects.Hero;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardController implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode){
            case 27:
                System.exit(0);
                break;
            case 37:
                Hero.moveHero('l');
                break;
            case 39:
                Hero.moveHero('r');
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        Hero.moveHero(' ');
    }
}
