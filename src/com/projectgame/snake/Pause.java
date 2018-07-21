package com.projectgame.snake;

import javax.swing.*;
import java.awt.*;

public class Pause {
    private Image img1;

    public Pause(){
        img1 = new ImageIcon(getClass().getResource("/Snake/space.png")).getImage();
    }
    public void drawSpace(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(img1,150,125,100,50,null);
        g.setColor(Color.WHITE);
        g.setFont(g.getFont().deriveFont(18f));
        g2D.drawString("PRESS SPACE TO PLAY GAME",80,200);
    }
}
