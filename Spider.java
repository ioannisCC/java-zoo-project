package com.ioannis.unipiZoo;

public class Spider extends Animal {
    private int eyesNumber;
    private static int counter=0;  //static because it has to count the instances of this specific class in order to give different id to each instance

    public Spider(String name, String homotaxy, double weight, int age, int eyesNumber) {
        super(name, homotaxy, weight, age);
        setClassname("spider");
        counter+=1;
        if (counter < 100) setId("spid"+00+counter);
        else if (counter >= 100) setId("spid"+00+counter);
    }

    @Override
    public int getEyesNumber() {
        return eyesNumber;
    }
    @Override
    public void setEyesNumber(int eyesNumber) {
        this.eyesNumber = eyesNumber;
    }

    @Override
    public void makeSound()
    {
        System.out.println("-----------------");

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
                "eyes number=" + eyesNumber +
                '}';
    }
}
