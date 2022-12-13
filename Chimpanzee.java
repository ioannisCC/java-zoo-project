package com.ioannis.unipiZoo;

public class Chimpanzee extends Animal {
    private int intelligenceLevel;
    private static int counter=0;   //static because it has to count the instances of this specific class in order to give different id to each instance

    public Chimpanzee(String name, String homotaxy, double weight, int age, int intelligenceLevel)
    {
        super(name, homotaxy, weight, age);
        this.intelligenceLevel = intelligenceLevel;
        setClassname("chimpanzee");
        counter+=1;
        if (counter < 100) setId("chimp"+00+counter);
        else if (counter >= 100) setId("chimp"+00+counter);
    }

    @Override
    public void setIntelligenceLevel(int intelligenceLevel) { this.intelligenceLevel = intelligenceLevel; }
    @Override
    public int getIntelligenceLevel() { return intelligenceLevel; }

    @Override
    public void makeSound()
    {
        System.out.println("-ououaaa ououaa ououaa-");

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
                "intelligence level=" + intelligenceLevel +
                '}' ;
    }

    //public void print() { System.out.println(toString()); }
}
