package com.ioannis.unipiZoo;

public class Panda extends Animal {
    private int bamboo;  //how many bamboos does he have
    private static int counter=0;   //static because it has to count the instances of this specific class in order to give different id to each instance

    public Panda(String name, String homotaxy, double weight, int age, int bamboo) {
        super(name, homotaxy, weight, age);
        this.bamboo = bamboo;
        setClassname("panda");
        counter+=1;
        if (counter < 100) setId("pand"+00+counter);
        else if (counter >= 100) setId("pand"+00+counter);
    }

    @Override
    public int getBamboo() {
        return bamboo;
    }
    @Override
    public void setBamboo(int bamboo) {
        this.bamboo = bamboo;
    }

    @Override
    public void makeSound()
    {
        System.out.println("-riar riar riar riar-");

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
                "bamboo number=" + bamboo +
                '}';
    }
}
