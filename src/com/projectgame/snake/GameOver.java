package com.projectgame.snake;

import javax.swing.*;
import java.awt.*;

public class GameOver {

    private Image img;

    public GameOver() {
        img = new ImageIcon(getClass().getResource("/Snake/gameover.png")).getImage();
    }

    public void drawString(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(img,150,250,100,50,null);
    }
}
