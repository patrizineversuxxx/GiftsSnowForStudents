package Game.Drawing;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    private GameField gameField;

    public GameWindow(){
        //Adding game field on main game window
        gameField = new GameField();
        Container container = getContentPane();
        container.add(gameField);

        //Setting game window properties
        setBounds(0,0,800,600);
        setTitle("GiftsSnow: THE GAME");
        setVisible(true);
    }
}
