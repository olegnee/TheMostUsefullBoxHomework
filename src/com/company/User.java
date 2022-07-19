package com.company;

public class User implements Runnable{
    private int iterationAmount;
    private int howOften;


    public int getIterationAmount() {
        return iterationAmount;
    }

    public void setIterationAmount(int iterationAmount) {
        this.iterationAmount = iterationAmount;
    }

    public int getHowOften() {
        return howOften;
    }

    public void setHowOften(int howOften) {
        this.howOften = howOften;
    }

    @Override
    public void run() {
        int i = 0;

        while (!(i == iterationAmount)) {
            try {
                Thread.sleep(howOften);
                Main.switcher = true;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
