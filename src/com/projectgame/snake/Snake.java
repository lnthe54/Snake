package com.projectgame.snake;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Snake {
    private int length = 2;
    private int[] x;
    private int[] y;
    private Image image, image1;

    private long beginTime = 0;

    public static int GO_UP = 1;
    public static int GO_DOWN = -1;
    public static int GO_LEFT = 2;
    public static int GO_RIGHT = -2;

    private int vector = Snake.GO_DOWN;

    private int speed = 100;
    private int max = 5;

    public Snake() {
        x = new int[20];
        y = new int[20];

        x[0] = 5;
        y[0] = 4;

        x[1] = 5;
        y[1] = 3;

        x[2] = 5;
        y[2] = 2;


        image = new ImageIcon(getClass().getResource("/Snake/snake1.png")).getImage();
        image1 = new ImageIcon(getClass().getResource("/Snake/than.png")).getImage();
    }


    public boolean toaDo(int x, int y) {
        for (int i = 0; i < length; i++) {
            if (this.x[i] == x && this.y[i] == y) {
                return true;
            }
        }
        return false;
    }

    public Point toaDoMoi() {
        Random r = new Random();
        int x, y;
        do {
            x = r.nextInt(19);
            y = r.nextInt(19);
        }
        while (toaDo(x, y));
        return new Point(x, y);
    }


    public void resetGame() {
        x = new int[20];
        y = new int[20];

        x[0] = 5;
        y[0] = 4;

        x[1] = 5;
        y[1] = 3;

        x[2] = 5;
        y[2] = 2;

        length = 2;
    }

    public void setVector(int v) {
        if (vector != -v) {
            vector = v;
        }

    }

    public void drawSnake(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        for (int i = 0; i < length; i++) {
            g2D.drawImage(image, x[0] * 20 + 1, y[0] * 20 + 1, 20, 20, null);
            g2D.drawImage(image1, x[i] * 20 + 1, y[i] * 20 + 1, 18, 18, null);
        }

    }

    public int getSpeed() {
        int speed = 100;
        for (int i = 0; i < MyPanel.currentLevel; i++) {
            speed *= 0.5;
        }
        return speed;

    }

    public void update() {
        if (length == max) {
            MyPanel.isPlay = false;
            resetGame();
            MyPanel.currentLevel++;
            speed = getSpeed();
        }

        for (int i = 1; i < length; i++) {
            if (x[0] == x[i] && y[0] == y[i]) {
                MyPanel.isPlay = false;
                MyPanel.isGameOver = true;
            }
        }


        if (System.currentTimeMillis() - beginTime > speed) {

            if (BackGround.background[x[0]][y[0]] == 2) {
                length++;
                BackGround.background[x[0]][y[0]] = 0;

                BackGround.background[toaDoMoi().x][toaDoMoi().y] = 2;

            }

            for (int i = length - 1; i > 0; i--) {
                x[i] = x[i - 1];
                y[i] = y[i - 1];
            }

            if (vector == Snake.GO_UP) {
                y[0]--;
            }
            if (vector == Snake.GO_DOWN) {
                y[0]++;
            }
            if (vector == Snake.GO_LEFT) {
                x[0]--;
            }
            if (vector == Snake.GO_RIGHT) {
                x[0]++;
            }

            if (x[0] < 0) {
                x[0] = 19;
            }
            if (x[0] > 19) {
                x[0] = 0;
            }


            if (y[0] < 0) {
                y[0] = 19;
            }
            if (y[0] > 19) {
                y[0] = 0;
            }
            beginTime = System.currentTimeMillis();
        }
    }
}
