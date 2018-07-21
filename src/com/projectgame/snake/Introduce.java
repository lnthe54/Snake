package com.projectgame.snake;

import javax.swing.*;
import java.awt.*;

public class Introduce {
    private Image img1, img2, img3, img4, img5;

    public Introduce() {
        img1 = new ImageIcon(getClass().getResource("/Snake/space.png")).getImage();
        img2 = new ImageIcon(getClass().getResource("/Snake/left.png")).getImage();
        img3 = new ImageIcon(getClass().getResource("/Snake/right.png")).getImage();
        img4 = new ImageIcon(getClass().getResource("/Snake/up.png")).getImage();
        img5 = new ImageIcon(getClass().getResource("/Snake/down.png")).getImage();
    }

    public void drawIntroduce(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(img1, 100, 400, 50, 50, null);
        g.setColor(Color.WHITE);
        g.setFont(g.getFont().deriveFont(18f));
        g2D.drawString("CHƠI / TẠM DỪNG", 165, 430);

        g2D.drawImage(img2, 20, 450, 50, 50, null);
        g.setColor(Color.WHITE);
        g.setFont(g.getFont().deriveFont(18f));
        g2D.drawString("TRÁI", 75, 480);

        g2D.drawImage(img3, 20, 500, 50, 50, null);
        g.setColor(Color.WHITE);
        g.setFont(g.getFont().deriveFont(18f));
        g2D.drawString("PHẢI", 75, 530);


        g2D.drawImage(img4, 175, 450, 50, 50, null);
        g.setColor(Color.WHITE);
        g.setFont(g.getFont().deriveFont(18f));
        g2D.drawString("LÊN", 230, 480);


        g2D.drawImage(img5, 175, 500, 50, 50, null);
        g.setColor(Color.WHITE);
        g.setFont(g.getFont().deriveFont(18f));
        g2D.drawString("XUỐNG", 230, 530);

    }
}
