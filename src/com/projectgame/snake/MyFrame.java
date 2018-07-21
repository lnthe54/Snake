package com.projectgame.snake;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame extends JFrame implements WindowListener {

    public static final int WIDTHF = 800;
    public static final int HEIGHTF = 600;

    private MyPanel myPanel;

    public MyFrame() {
        setTitle("Snake v1.0");
        setSize(WIDTHF, HEIGHTF);
        setLocationRelativeTo(null);
        setResizable(false); // Change size
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);


        addWindowListener(this);

        myPanel = new MyPanel();
        add(myPanel);

        addKeyListener(new Handler());

        setVisible(true); //Display
    }


    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        int result = JOptionPane.showConfirmDialog(null, "Do you want to exit ?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (result == JOptionPane.YES_OPTION){
            System.exit(0);
        }

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    private class Handler implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_SPACE){
                myPanel.isPlay =! myPanel.isPlay;
                if ( myPanel.isGameOver){
                    myPanel.isGameOver = false;
                    myPanel.snake.resetGame();
                }
            }

            if (e.getKeyCode() == KeyEvent.VK_UP){
                myPanel.snake.setVector(Snake.GO_UP);
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN){
                myPanel.snake.setVector(Snake.GO_DOWN);
            }
            if (e.getKeyCode() == KeyEvent.VK_LEFT){
                myPanel.snake.setVector(Snake.GO_LEFT);
            }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                myPanel.snake.setVector(Snake.GO_RIGHT);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}

