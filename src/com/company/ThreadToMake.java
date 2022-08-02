package com.company;

public class ThreadToMake extends Thread{
    public ThreadToMake(Runnable target) {
        super(target);
    }
}
