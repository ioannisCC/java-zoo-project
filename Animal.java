package com.ioannis.unipiZoo;
import java.io.Serializable;
import java.util.ArrayList;

public abstract class Animal implements Serializable, AnimalFunctionalities {  //implements Serializable in order to be able to serialize the objects
    private String id, name, homotaxy;
    private double weight;
    private int age;
    private String classname;   //this String is defined in each class as the name of the class and it used for functionality
    static ArrayList<Animal> animals = new ArrayList<>();  //array list that contains all animals instantiated (generic:Animal)

    public Animal() {}  //default constructor
    public Animal(String name, String homotaxy, double weight, int age)
    {
        this.name = name;
        this.homotaxy = homotaxy;
        this.weight = weight;
        this.age = age;
    }

    public double getWeight() { return weight; }
    public int getAge() { return age; }
    public String getHomotaxy() { return homotaxy; }
    public String getId() { return id; }
    public String getName() { return name; }
    public String getClassName() { return classname; }

    public void setAge(int age) { this.age = age; }
    public void setHomotaxy(String homotaxy) { this.homotaxy = homotaxy; }
    public void setName(String name) { this.name = name; }
    public void setWeight(double weight) { this.weight = weight; }
    public void setClassname(String classname) { this.classname = classname; }
    public void setId(String id) { this.id = id; }

    public void addAnimal(Animal animal) { animals.add(animal); }

    //these methods are overridden in each animal class depending on the animal
    public void setIntelligenceLevel(int intelligenceLevel) {}
    public int getIntelligenceLevel() { return 0; }
    public void setPlayfulness(int playfulness) {}
    public int getPlayfulness() {
        return 0;
    }
    public void setWingsLength(double wingsLength) {}
    public double getWingsLength() {
        return 0.0;
    }
    public void setMother(boolean mother) {}
    public boolean getMother() { return true; }
    public void setGender(String gender) {}
    public String getGender() {
        return "";
    }
    public void setBamboo(int bamboo) {}
    public int getBamboo() {
        return 0;
    }
    public void setColor(String color) {}
    public String getColor() {
        return "";
    }
    public void setHornLength(double hornLength) {}
    public double getHornLength() {
        return 0.0;
    }
    public void setLength(double length) {}
    public double getLength() {
        return 0.0;
    }
    public void setEyesNumber(int eyesNumber) {}
    public int getEyesNumber() {
        return 0;
    }
    public void setHeight(double height) {}
    public double getHeight() {
        return 0.0;
    }
    public void setVelocity(double velocity) {}
    public double getVelocity() {
        return 0.0;
    }
    public void setStripesNumber(int stripesNumber) {}
    public int getStripesNumber() {
        return 0;
    }

    @Override
    public String toString() {
        return classname+" {" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", homotaxy='" + homotaxy + '\'' +
                ", weight=" + weight +
                ", average max age=" + age +
                ", ";
    }
    public void print() { System.out.println(toString()); }
}
