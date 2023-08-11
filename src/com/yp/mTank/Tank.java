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
    private int speed = 3;

    public Tank(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    //判断移动方向并处理
    public void move(int direction) {
        switch (direction) {
            case 0:
                if (y - speed > 0) {
                    this.direction = 0;
                    y -= speed;
                }
                break;
            case 1:
                if (y + 60 + speed < 750) {
                    this.direction = 1;
                    y += speed;
                }
                break;
            case 2:
                if (x - speed > 0) {
                    this.direction = 2;
                    x -= speed;
                }
                break;
            case 3:
                if (x + 60 + speed < 1000) {
                    this.direction = 3;
                    x += speed;
                }
                break;
        }
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
