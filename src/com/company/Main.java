package com.company;

public class Main {
    volatile static boolean switcher;

    public static void main(String[] args) {
        User user = new User(5, 3000);
        ThreadToMake th1 = new ThreadToMake(user);
        Toy toy = new Toy(th1);
        ThreadToMake th2 = new ThreadToMake(toy);
        th1.start();
        th2.start();
    }
}