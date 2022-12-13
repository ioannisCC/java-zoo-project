package com.ioannis.unipiZoo;

public class Zebra extends Animal {
    private int stripesNumber;
    private static int counter=0;  //static because it has to count the instances of this specific class in order to give different id to each instance

    public Zebra(String name, String homotaxy, double weight, int age, int stripesNumber) {
        super(name, homotaxy, weight, age);
        this.stripesNumber = stripesNumber;
        setClassname("zebra");
        counter+=1;
        if (counter < 100) setId("zeb"+00+counter);
        else if (counter >= 100) setId("zeb"+00+counter);
    }

    @Override
    public int getStripesNumber() {
        return stripesNumber;
    }
    @Override
    public void setStripesNumber(int stripesNumber) {
        this.stripesNumber = stripesNumber;
    }

    @Override
    public void makeSound()
    {
        System.out.println("-iha iha iha iha-");

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
                "stripes number=" + stripesNumber +
                '}';
    }
}
