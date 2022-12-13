package com.ioannis.unipiZoo;

public class Rhinoceros extends Animal {
    private double hornLength;
    private static int counter=0;  //static because it has to count the instances of this specific class in order to give different id to each instance

    public Rhinoceros(String name, String homotaxy, double weight, int age, double hornLength) {
        super(name, homotaxy, weight, age);
        this.hornLength = hornLength;
        setClassname("rhinoceros");
        counter+=1;
        if (counter < 100) setId("rhino"+00+counter);
        else if (counter >= 100) setId("rhino"+00+counter);
    }

    @Override
    public double getHornLength() {
        return hornLength;
    }
    @Override
    public void setHornLength(double hornLength) {
        this.hornLength = hornLength;
    }

    @Override
    public void makeSound()
    {
       System.out.println("-mmmm mmmm mmmm-");

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
                "horn length=" + hornLength +
                '}';
    }
}
