package Game.Drawing;

import Game.Controls.KeyboardController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GameField extends JPanel {
    public GameField(){
        addKeyListener(new KeyboardController());
        setFocusable(true);

        Timer timer = new Timer(50, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.print("kek");
            repaint();
        }
    });



    }

    public void paintComponent(Graphics graphisc){

    }

}
