package com.projectgame.snake;

import javax.swing.*;
import java.awt.*;

public class Level {
    private Image lv1, lv2, lv3,lv4,lv5;

    public Level(){
        lv1 = new ImageIcon(getClass().getResource("/Snake/Level1.png")).getImage();
        lv2 = new ImageIcon(getClass().getResource("/Snake/Level2.png")).getImage();
        lv3 = new ImageIcon(getClass().getResource("/Snake/Level3.png")).getImage();
        lv4 = new ImageIcon(getClass().getResource("/Snake/Level4.png")).getImage();
        lv5 = new ImageIcon(getClass().getResource("/Snake/Level5.png")).getImage();
    }

    public void drawLevel(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        if (MyPanel.currentLevel == 1){
            g2D.drawImage(lv1,550,50,100,100,null);
        }
        if (MyPanel.currentLevel == 2){
            g2D.drawImage(lv2,550,50,100,100,null);
        }
        if (MyPanel.currentLevel == 3){
            g2D.drawImage(lv3,550,50,100,100,null);
        }
        if (MyPanel.currentLevel == 4){
            g2D.drawImage(lv4,550,50,100,100,null);
        }
        if (MyPanel.currentLevel == 5){
            g2D.drawImage(lv5,550,50,100,100,null);
        }
    }
}
