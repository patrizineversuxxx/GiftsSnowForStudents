package Game.Controls;

import Game.Drawing.GameField;
import com.sun.javafx.geom.Vec2d;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardController implements KeyListener {
    Vec2d direction = new Vec2d();
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        //Getting the key code
        int keyCode = e.getKeyCode();

        //Moving hero and cancelling game
        switch (keyCode){
            case 27:
                System.exit(0);
                break;
            case 37:
                direction.x=-1;
                GameField.mainHero.moveHero(direction);
                break;
            case 39:
                direction.x=1;
                GameField.mainHero.moveHero(direction);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        direction.x=0;
        GameField.mainHero.moveHero(direction);//Stops hero movement
    }
}
