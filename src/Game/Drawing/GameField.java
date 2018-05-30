package Game.Drawing;

import Game.Controls.KeyboardController;
import Game.Drawing.Objects.Hero;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;


public class GameField extends JPanel {
    private Image background;
    private char key;
    private Hero mainHero;

    GameField(){
        //Loading images from working folder
        try{
            background = ImageIO.read(new File("Background.jpg"));
            mainHero = new Hero("ShrekFace.png");
        }
        catch (IOException e){
            e.printStackTrace();
        }

        addKeyListener(new KeyboardController());//Adding keyboard controller
        setFocusable(true);

        Timer timer = new Timer(30, e -> repaint());//Update by timer
        timer.start();
    }

    public void paintComponent(Graphics graphisc){
        //Drawing background image and main hero model
        //Background draws before main hero because it cleans up game field
        graphisc.drawImage(background,0,0,800,600,null);
        graphisc.drawImage(mainHero.getModel(),mainHero.getX(),465, null);
    }
}
