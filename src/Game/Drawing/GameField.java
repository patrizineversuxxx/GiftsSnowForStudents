package Game.Drawing;

import Game.Controls.KeyboardController;
import Game.Drawing.Objects.Hero;
import Game.GameMain;

import javax.swing.*;
import java.awt.*;


public class GameField extends JPanel {
    private Image background;
    public static Hero mainHero;
    private int score;

    GameField(){
        //Loading images from working folder
        background = GameMain.backgroundImage;
        mainHero = new Hero(GameMain.mainHeroImage);

        addKeyListener(new KeyboardController());//Adding keyboard controller
        setFocusable(true);

        Timer timer = new Timer(30, e -> repaint());//Update by timer
        timer.start();
    }

    public void paintComponent(Graphics graphics){
        //Drawing background image and main hero model
        //Background draws before main hero because it cleans up game field
        graphics.drawImage(background,0,0,GameWindow.width,GameWindow.height,null);
        graphics.drawImage(mainHero.model,(int)mainHero.movement.x,
                (int)mainHero.movement.y, null);

        //Drawing score count
        graphics.setColor(Color.white);
        graphics.setFont(new Font("Arial", Font.PLAIN, 32));
        graphics.drawString("Score: " + score,10,30);
    }
}
