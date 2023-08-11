package com.yp.mTank;

import javax.swing.*;

/**
 * @author 杨鹏
 * @version 1.0
 */
public class Console extends JFrame {
    MPanel mPanel;

    public Console() {
        mPanel = new MPanel();
        new Thread(mPanel).start();
        this.setSize(1000, 750);
        this.add(mPanel);
        this.addKeyListener(mPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {

        new Console();
    }
}
