package com.yp.mTank;

/**
 * @author 杨鹏
 * @version 1.0
 */
public class ETank extends Tank implements Runnable {
    public ETank(int x, int y, int direction) {
        super(x, y, direction);
        setType(1);
    }


    @Override
    public void run() {
        int times = 0;
        int direction = 1;

        while (true) {

            if (times <= 0 && Math.random() < 0.5) {
                direction = (int) (Math.random() * 4);
                times = 150;
            } else {
                switch (direction) {
                    case 0:
                        move(0);
                        break;
                    case 1:
                        move(1);
                        break;
                    case 2:
                        move(2);
                        break;
                    case 3:
                        move(3);
                        break;
                }
                times--;
            }

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}
