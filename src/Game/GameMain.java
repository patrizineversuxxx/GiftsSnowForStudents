package Game;

import Game.Drawing.GameWindow;
import com.sun.javafx.geom.Vec2d;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class GameMain {

    public static Image backgroundImage, mainHeroImage, gameOverImage;
    public static Image [] giftImages = new Image[7];

    public static void preparingImages(){
        try {
            backgroundImage = ImageIO.read(new File("Background.jpg"));
            mainHeroImage = ImageIO.read(new File("ShrekFace.png"));
            gameOverImage = ImageIO.read(new File("GameOver.png"));
            for (int i=0; i<7; i++){
                giftImages[i] = ImageIO.read(new File("Gift"+ i +".png"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        preparingImages();
        GameWindow gameWindow = new GameWindow();
    }
}
