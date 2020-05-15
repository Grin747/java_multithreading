package com.company;

public class SyncBuffer {
    private int x;
    private int count;

    public void incX(){
        x++;
    }

    public void incCount(){
        count++;
    }

    public int getX(){
        return x;
    }

    public int getCount(){
        return count;
    }
}
