package Game.Drawing.Objects;

import Game.Drawing.GameWindow;
import com.sun.javafx.geom.Vec2d;

import java.awt.*;

public class Hero {
    public Image model;
    public Vec2d movement;
    private int speed=30;

    public Hero(Image model){
        this.model = model;//Setting hero model
        movement.x=0;//Drawing model at left bottom corner
        movement.y=400;
    }

    public void moveHero(Vec2d direction){
        int modelWidth = model.getWidth(null);
        switch((int)direction.x){
            case -1:
                if (movement.x-speed>-modelWidth /2)
                    movement.x-=speed;
                else movement.x = GameWindow.width -modelWidth/2;
                break;
            case 1:
                if(movement.x+speed<GameWindow.width-modelWidth/2)
                    movement.x+=speed;
                else movement.x = -modelWidth/2;
                break;
        }
    }
}
