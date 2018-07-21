package com.projectgame.snake;

import javax.swing.*;
import java.awt.*;

public class Stone {
    private Image img1,img2,img3;

    public Stone(){

        img1 = new ImageIcon(getClass().getResource("/Snake/stone.png")).getImage();
        img2 = new ImageIcon(getClass().getResource("/Snake/hoi.png")).getImage();
        img3 = new ImageIcon(getClass().getResource("/Snake/volume.png")).getImage();
    }
    public void drawStone(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(img1,380,380,50,50,null);
        g2D.drawImage(img1,700,500,100,70,null);
        g2D.drawImage(img2,750,20,25,25,null);
        g2D.drawImage(img3,750,50,25,25,null);
    }
}
