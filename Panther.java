package com.ioannis.unipiZoo;

public class Panther extends Animal {
    private double velocity;
    private static int counter=0;  //static because it has to count the instances of this specific class in order to give different id to each instance

    public Panther(String name, String homotaxy, double weight, int age, double velocity) {
        super(name, homotaxy, weight, age);
        this.velocity = velocity;
        setClassname("panther");
        counter+=1;
        if (counter < 100) setId("panth"+00+counter);
        else if (counter >= 100) setId("panth"+00+counter);
    }

    @Override
    public double getVelocity() {
        return velocity;
    }
    @Override
    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    @Override
    public void makeSound()
    {
        System.out.println("-rouar rouar rouar-");

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
                "average velocity=" + velocity +
                '}';
    }
}
