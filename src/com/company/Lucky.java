package com.company;

public class Lucky {
    private static final SyncBuffer buf = new SyncBuffer();

    static class LuckyThread extends Thread {
        @Override
        public void run() {
            while (true) {
                synchronized (buf) {
                    if (buf.getX() >= 999999) break;
                    buf.incX();
                    if ((buf.getX() % 10) + (buf.getX() / 10) % 10 + (buf.getX() / 100) % 10 == (buf.getX() / 1000)
                            % 10 + (buf.getX() / 10000) % 10 + (buf.getX() / 100000) % 10) {
                        System.out.println(buf.getX() + " " + this.getName());
                        buf.incCount();
                    }
                }
            }
        }

        public static int getCount(){
            return buf.getCount();
        }
    }
}