package com.projectgame.snake;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel implements Runnable {

    Thread thread;
    BackGround backGround;
    Snake snake;
    Pause pause;
    GameOver gameOver;

    static boolean isPlay = false;
    static boolean isGameOver = false;
    static boolean enableTextStart = true;
    static int currentLevel = 1;

    public MyPanel() {
        backGround = new BackGround();
        snake = new Snake();
        pause = new Pause();
        gameOver = new GameOver();
        backGround.background[10][10] = 2;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        super.paintComponent(g2D);
        backGround.drawBackGround(g2D);
        snake.drawSnake(g2D);

        if (!isPlay) {
            if (enableTextStart){
                pause.drawSpace(g2D);
            }
        }

        if (isGameOver){
               gameOver.drawString(g2D);
        }
    }


    @Override
    public void run() {
        long time1 = 0;
        while (true) {
            if (System.currentTimeMillis()-time1 > 500){
                enableTextStart =! enableTextStart;
                time1 = System.currentTimeMillis();
            }
            if (isPlay) {
                snake.update();
            }
            repaint();
            try {
                thread.sleep(20);
            } catch (Exception e) {

            }
        }
    }
}

