package com.ioannis.unipiZoo;

public class Lion extends Animal {
    private String gender;
    private static int counter=0;  //static because it has to count the instances of this specific class in order to give different id to each instance

    public Lion(String name, String homotaxy, double weight, int age, String gender) {
        super(name, homotaxy, weight, age);
        this.gender = gender;
        setClassname("lion");
        counter+=1;
        if (counter < 100) setId("li"+00+counter);
        else if (counter >= 100) setId("li"+00+counter);
    }

    @Override
    public String getGender() {
        return gender;
    }
    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void makeSound()
    {
        System.out.println("-roar roar roar roar-");

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
                "gender='" + gender + '\'' +
                '}';
    }
}
