package com.yp.mTank;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import javax.swing.*;
import java.awt.*;

/**
 * @author 杨鹏
 * @version 1.0
 */
public class MPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        g.fillRect(0, 0, 1000, 750);
        drawTank(g, 100, 100, 0, 1);
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
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }

    }


}
