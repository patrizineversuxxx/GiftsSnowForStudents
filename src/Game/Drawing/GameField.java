package Game.Drawing;

import Game.Controls.KeyboardController;
import Game.Drawing.Objects.Hero;
import Game.GameMain;

import javax.swing.*;
import java.awt.*;


public class GameField extends JPanel {
    private Image background;
    private char key;
    public static Hero mainHero;

    GameField(){
        //Loading images from working folder
        background = GameMain.backgroundImage;
        mainHero = new Hero(GameMain.mainHeroImage);

        addKeyListener(new KeyboardController());//Adding keyboard controller
        setFocusable(true);

        Timer timer = new Timer(30, e -> repaint());//Update by timer
        timer.start();
    }

    public void paintComponent(Graphics graphisc){
        //Drawing background image and main hero model
        //Background draws before main hero because it cleans up game field
        graphisc.drawImage(background,0,0,GameWindow.width,GameWindow.height,null);
        graphisc.drawImage(mainHero.model,mainHero.x,400, null);
    }
}
