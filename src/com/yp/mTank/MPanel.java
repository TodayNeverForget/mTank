package com.yp.mTank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author 杨鹏
 * @version 1.0
 */
public class MPanel extends JPanel implements KeyListener, Runnable {
    int eNum = 4;
    MTank mTank = null;
    Vector<ETank> eTanks = new Vector<>();

    public MPanel() {
        //初始化敌方坦克
        eTanks = initETanks(eNum);
        //初始化我方坦克
        mTank = new MTank(350, 400, 0);

    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(0, 0, 1000, 750);
        //画出敌方坦克
        drawETanks(g, eTanks);
        //画出我方坦克
        drawMTank(g, mTank);

    }

    public void drawTank(Graphics g, int x, int y, int direction, int type) {
        switch (type) {
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.red);
                break;
        }
        switch (direction) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 2:
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
            case 3:
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
        }

    }

















    //初始化敌方坦克方法
    public Vector<ETank> initETanks(int eNum) {
        Vector<ETank> eTanks = new Vector<>();
        ETank eTank;
        for (int i = 0; i < eNum; i++) {
            eTank = new ETank(150 * i + 100, 100, 1);
            eTanks.add(eTank);
        }
        return eTanks;
    }

    //画敌方坦克方法
    public void drawETanks(Graphics g, Vector<ETank> eTanks) {
        if (eTanks == null) return;

        ETank eTank;
        for (int i = 0; i < eTanks.size(); i++) {
            eTank = eTanks.get(i);
            drawTank(g, eTank.getX(), eTank.getY(),
                    eTank.getDirection(), eTank.getType());
        }
    }

    //画我方坦克方法
    public void drawMTank(Graphics g, MTank mTank) {
        drawTank(g, mTank.getX(),mTank.getY(),
                mTank.getDirection(), mTank.getType());
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            mTank.move(0);
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            mTank.move(1);
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            mTank.move(2);
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            mTank.move(3);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            repaint();
            //刷新频率
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
