package com.company;

public class Toy implements Runnable{
    @Override
    public void run() {
        while (Main.switcher) {
            Main.switcher = false;

        }
    }
}
