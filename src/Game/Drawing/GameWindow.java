package Game.Drawing;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    private GameField gameField;
    public static int width, height;

    public GameWindow(){
        //Adding game field on main game window
        gameField = new GameField();
        Container container = getContentPane();
        container.add(gameField);

        //Setting game window properties
        width = 800;
        height = 600;
        setBounds(0,0,width,height);
        setTitle("GiftsSnow: THE GAME");
        setVisible(true);
    }
}
