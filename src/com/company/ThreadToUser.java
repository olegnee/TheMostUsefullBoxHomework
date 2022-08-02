package com.company;

public class ThreadToUser extends Thread{
    public ThreadToUser(Runnable target) {
        super(target);
    }
}
