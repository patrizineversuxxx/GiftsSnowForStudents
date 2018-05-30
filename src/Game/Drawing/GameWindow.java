package Game.Drawing;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    private GameField gameField;

    public GameWindow(){


        setBounds(0,0,800,600);
        setTitle("GiftsSnow: THE GAME");

        gameField = new GameField();
        Container container = getContentPane();
        container.add(gameField);

        setVisible(true);
    }
}
