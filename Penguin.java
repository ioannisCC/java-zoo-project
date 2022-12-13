package com.ioannis.unipiZoo;

public class Penguin extends Animal {
    private String color;
    private static int counter=0;  //static because it has to count the instances of this specific class in order to give different id to each instance

    public Penguin(String name, String homotaxy, double weight, int age, String color) {
        super(name, homotaxy, weight, age);
        this.color = color;
        setClassname("penguin");
        counter+=1;
        if (counter < 100) setId("peng"+00+counter);
        else if (counter >= 100) setId("peng"+00+counter);
    }

    @Override
    public String getColor() {
        return color;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void makeSound()
    {
        System.out.println("-krink krink krink-");

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
                "color='" + color + '\'' +
                '}';
    }
}
