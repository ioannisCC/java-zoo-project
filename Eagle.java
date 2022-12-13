package com.ioannis.unipiZoo;

public class Eagle extends Animal {
    public double wingsLength;
    private static int counter=0;  //static because it has to count the instances of this specific class in order to give different id to each instance

    public Eagle(String name, String homotaxy, double weight, int age, double wingsLength) {
        super(name, homotaxy, weight, age);
        this.wingsLength = wingsLength;
        setClassname("eagle");
        counter+=1;
        if (counter < 100) setId("eag"+00+counter);
        else if (counter >= 100) setId("eag"+00+counter);
    }
    @Override
    public double getWingsLength() {
        return wingsLength;
    }
    @Override
    public void setWingsLength(double wingsLength) {
        this.wingsLength = wingsLength;
    }

    @Override
    public void makeSound()
    {
        System.out.println("-kra kra kra kra-");

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
                " wings length=" + wingsLength +
                '}';
    }
}
