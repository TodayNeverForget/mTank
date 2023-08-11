package com.yp.mTank;

/**
 * @author 杨鹏
 * @version 1.0
 */
public class ETank extends Tank {
    public ETank(int x, int y, int direction) {
        super(x, y, direction);
        setType(1);
    }
}
