package com.ioannis.unipiZoo;

public class Kangaroo extends Animal {
    private boolean mother;  //true for mother-false for father
    private static int counter=0;  //static because it has to count the instances of this specific class in order to give different id to each instance

    public Kangaroo(String name, String homotaxy, double weight, int age, boolean mother) {
        super(name, homotaxy, weight, age);
        this.mother = mother;
        setClassname("kangaroo");
        counter+=1;
        if (counter < 100) setId("kang"+00+counter);
        else if (counter >= 100) setId("kang"+00+counter);
    }

    @Override
    public boolean getMother() { return mother; }
    @Override
    public void setMother(boolean mother) {
        this.mother = mother;
    }

    @Override
    public void makeSound()
    {
        System.out.println("-kruink kruink kruink-");

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
                " is she a mother?=" + mother +
                '}';
    }
}
