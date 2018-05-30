package Game.Drawing.Objects;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Hero {
    private static Image model;
    private static int x;
    private static int speed=30;

    public Hero(String modelPath){
        try{
            model = ImageIO.read(new File(modelPath));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        x=0;
    }

    public Image getModel() {
        return model;
    }

    public int getX() {
        return x;
    }

    public static void moveHero(char direction){
        int modelWidth = model.getWidth(null);
        switch(direction){
            case 'l':
                if (x-speed>-modelWidth /2)
                    x-=speed;
                else x = 800-modelWidth/2;
                break;
            case 'r':
                if(x+speed<800-modelWidth/2)
                    x+=speed;
                else x = -modelWidth/2;
        }
    }
}
