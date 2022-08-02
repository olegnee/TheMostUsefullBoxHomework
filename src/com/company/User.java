package com.company;

public class User implements Runnable{

    private int iterationAmount;
    private int howOften;

    public User(int iterationAmount, int howOften) {
        this.iterationAmount = iterationAmount;
        this.howOften = howOften;
    }

    @Override
    public void run() {
        int i = 0;

        while (true) {
            try {
                Thread.sleep(howOften);
                Main.switcher = true;
                System.out.println("Включаю");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
            if (i == iterationAmount) {
                break;
            }

        }
    }
}
