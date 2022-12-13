package com.ioannis.unipiZoo;

public class Dolphin extends Animal {
    private int playfulness;  //an indicator to how playful the dolphin is
    private static int counter=0;  //static because it has to count the instances of this specific class in order to give different id to each instance

    public Dolphin(String name, String homotaxy, double weight, int age, int playfulness) {
        super(name, homotaxy, weight, age);
        this.playfulness = playfulness;
        setClassname("dolphin");
        counter+=1;
        if (counter < 100) setId("dolph"+00+counter);
        else if (counter >= 100) setId("dolph"+00+counter);
    }
    @Override
    public void setPlayfulness(int playfulness) {
        this.playfulness = playfulness;
    }
    @Override
    public int getPlayfulness() {
        return playfulness;
    }

    @Override
    public void makeSound()
    {
        System.out.println("-krkr krkr krkr krkr-");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rarity()
    {
        if (counter<3)
            System.out.println("animal is rare in our zoo");
        else
            System.out.println("animal is common in our zoo");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "playfulness level=" + playfulness +
                '}';
    }
}
