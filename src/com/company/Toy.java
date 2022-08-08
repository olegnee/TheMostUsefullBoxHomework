package com.company;

public class Toy implements Runnable {
    private Thread th;

    public Toy(Thread th) {
        this.th = th;
    }

    @Override
    public void run() {
        while (true) {
            if (Main.switcher) {
                Main.switcher = false;
                System.out.println("Выключаю");
            }
            if (!(th.isAlive())) {
                Main.switcher = false;
                System.out.println("Выключаю");
                break;
            }
        }
    }
}
