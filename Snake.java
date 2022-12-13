package com.ioannis.unipiZoo;
public class Snake extends Animal {
    private double length;
    private static int counter=0;  //static because it has to count the instances of this specific class in order to give different id to each instance

    public Snake(String name, String homotaxy, double weight, int age, double length) {
        super(name, homotaxy, weight, age);
        setClassname("snake");
        counter+=1;
        if (counter < 100) setId("sn"+00+counter);
        else if (counter >= 100) setId("sn"+00+counter);
    }

    @Override
    public double getLength() {
        return length;
    }
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void makeSound()
    {
        System.out.println("-ssss ssss ssss ssss-");

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
                "length=" + length +
                '}';
    }
}
