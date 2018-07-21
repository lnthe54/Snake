package com.projectgame.snake;

import javax.swing.*;
import java.awt.*;

public class BackGround {
    static int[][] background = new int[20][20];

    private Introduce introduce;
    private Stone stone;
    private Level level;

    private Image bg1, bg2, image1, image2;

    public BackGround() {
        introduce = new Introduce();
        stone = new Stone();
        level = new Level();
        bg1 = new ImageIcon(getClass().getResource("/Snake/bg3.png")).getImage();
        bg2 = new ImageIcon(getClass().getResource("/Snake/bg2.jpg")).getImage();
        image1 = new ImageIcon(getClass().getResource("/Snake/strawberry.png")).getImage();
        image2 = new ImageIcon(getClass().getResource("/Snake/stone.png")).getImage();


    }

    public void drawBackGround(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(bg1, 0, 0, 800, 600, null);
        g2D.drawImage(bg2, 0, 0, 400, 400, null);

        introduce.drawIntroduce(g2D);
        stone.drawStone(g2D);
        level.drawLevel(g2D);

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {

                if (background[i][j] == 2) {
                    g2D.drawImage(image1, i * 20 +1, j * 20 + 1, 18, 18, null);
                }
            }
        }
    }
}
