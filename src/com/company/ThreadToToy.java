package com.company;

public class ThreadToToy extends Thread {
    public ThreadToToy(Runnable target) {
        super(target);
    }
}
