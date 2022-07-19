package com.company;

public class Main {
    volatile static boolean switcher;
    public static void main(String[] args) {

        User user = new User();
        Toy toy = new Toy();
        user.setHowOften(1500);
        user.setIterationAmount(3);
        new Thread(null, user, "someuser").start();
        new Thread(null, toy, "sometoy").start();
        for(int i = 0; i <= user.getIterationAmount(); i++)
        if (switcher) {
            System.out.println("Тумблер был включен.");
        }
        else {
            System.out.println("И тут же выключен.");
        }
    }
}
