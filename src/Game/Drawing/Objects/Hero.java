package Game.Drawing.Objects;

import Game.Drawing.GameWindow;
import com.sun.javafx.geom.Vec2d;

import java.awt.*;

public class Hero {
    public Image model;
    public int x;
    private int speed=30;

    public Hero(Image model){
        this.model = model;//Setting hero model
        x=0;//Drawing model at left bottom corner
    }

    public void moveHero(Vec2d direction){
        int modelWidth = model.getWidth(null);
        switch((int)direction.x){
            case -1:
                if (x-speed>-modelWidth /2)
                    x-=speed;
                else x = GameWindow.width -modelWidth/2;
                break;
            case 1:
                if(x+speed<GameWindow.width-modelWidth/2)
                    x+=speed;
                else x = -modelWidth/2;
        }
    }
}
