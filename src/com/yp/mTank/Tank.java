package com.yp.mTank;

/**
 * @author 杨鹏
 * @version 1.0
 */
public class Tank {
    private int x;
    private int y;
    private int direction;
    private int type;

    public Tank(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDirection() {
        return direction;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
