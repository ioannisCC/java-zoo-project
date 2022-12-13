package com.ioannis.unipiZoo;

import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Zoo extends Animal {

    public static void console() //first menu
    {
        System.out.println("");
        System.out.println("please select from below:");
        System.out.println("");
        System.out.println("1  - display available animals");
        System.out.println("2  - insert new animal");
        System.out.println("3  - search animal by its name");
        System.out.println("4  - search animal by its id");
        System.out.println("5  - edit animal by its id");
        System.out.println("6  - delete animal by its id");
        System.out.println("7  - play with the animals");
        System.out.println("8  - information about our animals (wikipedia) and also see them");
        System.out.println("9  - exit");
        System.out.println(":)  type hidden number for surprise");
        System.out.println("    (hint: the number are the first three digits after the comma of the pi number)");
    }

    /*these inner classes below are used in order to return multiple values so that I can store each of these value
    inside the creation classes below (newChimpanzee, newDolphin etc.)*/
    //static so they  can be called from a static context (main)
    static class MultipleStore {
        static String name;
        static String homotaxy;
        static double weight;
        static int age;

        MultipleStore(String name,String homotaxy,double weight,int age)
        {
            this.name = name;
            this.homotaxy = homotaxy;
            this.weight = weight;
            this.age = age;
        }
    }
    static class ReturnMultiple {
        MultipleStore getValues()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("enter a name: ");
            String name = scanner.next();
            System.out.print("enter its homotaxy: ");
            String homotaxy = scanner.next();
            System.out.print("enter its weight (double-type in kilos): ");
            double weight = scanner.nextDouble();
            System.out.print("enter its max average age (integer): ");
            int age = scanner.nextInt();

            return new MultipleStore(name,homotaxy,weight,age);
        }
    }

    /*each method below creates a new instance of the class declared and after it is saved inside the ArrayList with all animals*/
    public Chimpanzee newChimpanzee()
    {
        new ReturnMultiple().getValues();
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter its intelligence level (integer): ");
        int intelligenceLevel = scanner.nextInt();
        Chimpanzee chimp = new Chimpanzee(MultipleStore.name,MultipleStore.homotaxy,
                MultipleStore.weight,MultipleStore.age,intelligenceLevel);
        chimp.addAnimal(chimp);
        return chimp;
    }
    public Dolphin newDolphin()
    {
        new ReturnMultiple().getValues();
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter its playfulness level (integer): ");
        int playfullness = scanner.nextInt();
        Dolphin dolphin = new Dolphin(MultipleStore.name,MultipleStore.homotaxy,
                MultipleStore.weight,MultipleStore.age,playfullness);
        dolphin.addAnimal(dolphin);
        return dolphin;
    }
    public Eagle newEagle()
    {
        new ReturnMultiple().getValues();
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter its wings length (double): ");
        double wingsLength = scanner.nextDouble();
        Eagle eagle = new Eagle(MultipleStore.name,MultipleStore.homotaxy,
            MultipleStore.weight,MultipleStore.age,wingsLength);
        eagle.addAnimal(eagle);
        return eagle;
    }
    public Giraffe newGiraffe()
    {
        new ReturnMultiple().getValues();
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter its height (double): ");
        double height = scanner.nextDouble();
        Giraffe giraffe = new Giraffe(MultipleStore.name,MultipleStore.homotaxy,
                MultipleStore.weight,MultipleStore.age,height);
        giraffe.addAnimal(giraffe);
        return giraffe;
    }
    public Kangaroo newKangaroo()
    {
        new ReturnMultiple().getValues();
        Scanner scanner = new Scanner(System.in);
        System.out.print("is it a mother (enter 'true' or 'false'): ");
        boolean mother = scanner.nextBoolean();
        Kangaroo kangaroo = new Kangaroo(MultipleStore.name,MultipleStore.homotaxy,
                MultipleStore.weight,MultipleStore.age,mother);
        kangaroo.addAnimal(kangaroo);
        return kangaroo;
    }
    public Lion newLion()
    {
        new ReturnMultiple().getValues();
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter its wings length (double): ");
        String gender = scanner.next();
        Lion lion = new Lion(MultipleStore.name,MultipleStore.homotaxy,
                MultipleStore.weight,MultipleStore.age,gender);
        lion.addAnimal(lion);
        return lion;
    }
    public Panda newPanda()
    {
        new ReturnMultiple().getValues();
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number of bamboo he has (integer): ");
        int bamboo = scanner.nextInt();
        Panda panda = new Panda(MultipleStore.name,MultipleStore.homotaxy,
                MultipleStore.weight,MultipleStore.age,bamboo);
        panda.addAnimal(panda);
        return panda;
    }
    public Penguin newPenguin()
    {
        new ReturnMultiple().getValues();
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter its color: ");
        String color = scanner.next();
        Penguin penguin = new Penguin(MultipleStore.name,MultipleStore.homotaxy,
                MultipleStore.weight,MultipleStore.age,color);
        penguin.addAnimal(penguin);
        return penguin;
    }
    public Panther newPanther()
    {
        new ReturnMultiple().getValues();
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter its average velocity (double): ");
        double velocity = scanner.nextDouble();
        Panther panther = new Panther( MultipleStore.name,MultipleStore.homotaxy,
                MultipleStore.weight,MultipleStore.age,velocity);
        panther.addAnimal(panther);
        return panther;
    }
    public Rhinoceros newRhinoceros()
    {
        new ReturnMultiple().getValues();
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter its horn length (double): ");
        double hornLength = scanner.nextDouble();
        Rhinoceros rhinoceros = new Rhinoceros(MultipleStore.name,MultipleStore.homotaxy,
                MultipleStore.weight,MultipleStore.age,hornLength);
        rhinoceros.addAnimal(rhinoceros);
        return rhinoceros;
    }
    public Snake newSnake()
    {
        new ReturnMultiple().getValues();
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter its length (double): ");
        double length = scanner.nextDouble();
        Snake snake = new Snake(MultipleStore.name,MultipleStore.homotaxy,
                MultipleStore.weight,MultipleStore.age,length);
        snake.addAnimal(snake);
        return snake;
    }
    public Spider newSpider()
    {
        new ReturnMultiple().getValues();
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter its number of eyes (integer): ");
        int eyesNumber = scanner.nextInt();
        Spider spider = new Spider(MultipleStore.name,MultipleStore.homotaxy,
                MultipleStore.weight,MultipleStore.age,eyesNumber);
        spider.addAnimal(spider);
        return spider;
    }
    public Zebra newZebra()
    {
        new ReturnMultiple().getValues();
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter its number of stripes (int): ");
        int stripesNumber = scanner.nextInt();
        Zebra zebra = new Zebra(MultipleStore.name,MultipleStore.homotaxy,
                MultipleStore.weight,MultipleStore.age,stripesNumber);
        zebra.addAnimal(zebra);
        return zebra;
    }

    public void showAnimals()
    {
        System.out.println("animals we already have:");
        System.out.println("1  - chimpanzee");
        System.out.println("2  - dolphin");
        System.out.println("3  - eagle");
        System.out.println("4  - kangaroo");
        System.out.println("5  - lion");
        System.out.println("6  - panda");
        System.out.println("7  - penguin");
        System.out.println("8  - rhinoceros");
        System.out.println("9  - snake");
        System.out.println("10 - spider");
        System.out.println("**************");
        System.out.println("animals we can bring:");
        System.out.println("11 - giraffe");
        System.out.println("12 - panther");
        System.out.println("13 - zebra");
    }

    //with the method below we choose which animal will be instantiated
    public void animalChoice()
    {
        System.out.println("");
        System.out.println("choose animal");
        System.out.println("-------------");
        showAnimals();
        Scanner scanner = new Scanner(System.in);
        int animalChoice = scanner.nextInt();
        switch (animalChoice) {
            case 1:
                newChimpanzee();
                System.out.println("success");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                newDolphin();
                System.out.println("success");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                newEagle();
                System.out.println("success");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 4:
                newGiraffe();
                System.out.println("success");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 5:
                newKangaroo();
                System.out.println("success");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 6:
                newLion();
                System.out.println("success");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 7:
                newPanda();
                System.out.println("success");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 8:
                newPanther();
                System.out.println("success");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 9:
                newPenguin();
                System.out.println("success");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 10:
                newRhinoceros();
                System.out.println("success");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 11:
                newSnake();
                System.out.println("success");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 12:
                newSpider();
                System.out.println("success");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 13:
                newZebra();
                System.out.println("success");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("your input does not match none of given options");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
    }

    //the method below searches for an animal by its name inside the 'animals' array list
    public String searchByName()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the name of the animal you want to search:  ");
        String name = scanner.nextLine();
        for (var animal:animals)
        {
            if (name.equals(animal.getName()))
            {
                System.out.println(animal);
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "animal found\n";
            }
            else
            {
                System.out.println("animal not found");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "";
            }
        }
        return "error";
    }

    //the method below searches for an animal by its id inside the 'animals' array list
    public String searchByID()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the id of the animal you want to search:  ");
        String id = scanner.nextLine();
        for (var animal:animals)
        {
            if (id.equals(animal.getId()))
            {
                System.out.println(animal);
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "animal found\n";
            }
            else
            {
                System.out.println("animal not found");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "";
            }
        }
        return "error";
    }

    //the method below deletes an animal by its id inside the 'animals' array list
    public void deleteByID()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the id of the animal you want to delete:  ");
        String id = scanner.nextLine();
        outer: for (var animal:animals)
        {
            if (id.equals(animal.getId()))
            {
                animals.remove(animal);     //delete it from the array with animals
                animal = null;              //set reference to that specific animal to null, so it deletes
                System.out.println("animal deleted");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break outer;
            }
            else
            {
                System.out.println("error");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //the method below edits an animal by its id inside the 'animals' array list
    public void editAnimal()
    {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("enter the id of the animal you want to edit:  ");
        String id = scanner1.nextLine();
        for (var animal: animals)
        {
            if (!(id.equals(animal.getId())))
                System.out.println("animal not found");
            else if (id.equals(animal.getId()))
            {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("would you ike to change its name?");
                System.out.print("type 'y' for yes and 'n' for no:  ");
                String choice2 = scanner2.nextLine();
                switch (choice2){
                    case "y":
                        Scanner scannerName = new Scanner(System.in);
                        System.out.print("enter new name:  ");
                        String newName = scannerName.nextLine();
                        animal.setName(newName);
                        System.out.println("success");
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "n":
                        break;
                    default:
                        System.out.println("wrong input");
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                }
                System.out.println("");
                System.out.println("would you ike to change its homotaxy?");
                System.out.print("type 'y' for yes and 'n' for no:  ");
                String choice3 = scanner2.nextLine();
                switch (choice3){
                    case "y":
                        Scanner scannerName = new Scanner(System.in);
                        System.out.print("enter new homotaxy:  ");
                        String newHomotaxy = scannerName.nextLine();

                        animal.setHomotaxy(newHomotaxy);
                        System.out.println("success");
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                                }
                        break;
                    case "n":
                        break;
                    default:
                        System.out.println("wrong input");
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                }
                System.out.println("");
                System.out.println("would you ike to change its weight?");
                System.out.print("type 'y' for yes and 'n' for no:  ");
                String choice4 = scanner2.nextLine();
                switch (choice4){
                    case "y":
                        Scanner scannerName = new Scanner(System.in);
                        System.out.print("enter new weight (double):  ");
                        double newWeight = scannerName.nextDouble();
                        animal.setWeight(newWeight);
                        System.out.println("success");
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "n":
                        break;
                    default:
                        System.out.println("wrong input");
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                }
                System.out.println("");
                System.out.println("would you ike to change its average max age?");
                System.out.print("type 'y' for yes and 'n' for no:  ");
                String choice5 = scanner2.nextLine();
                switch (choice5){
                    case "y":
                        Scanner scannerName = new Scanner(System.in);
                        System.out.print("enter new average max age (integer):  ");
                        int newAge = scannerName.nextInt();
                        animal.setAge(newAge);
                        System.out.println("success");
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "n":
                        break;
                    default:
                        System.out.println("wrong input");
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                }
                System.out.println("");
                        if ((animal.getClassName()).equals("chimpanzee")) {
                            System.out.println("current intelligence level: " + animal.getIntelligenceLevel());
                            System.out.println("would you like to change its intelligence level?");
                            System.out.print("type 'y' for yes and 'n' for no:  ");
                            String choice = scanner1.nextLine();
                            switch (choice) {
                                case "y":
                                    System.out.println("enter new intelligence level (integer):  ");
                                    int intelligenceLevel = scanner2.nextInt();
                                    animal.setIntelligenceLevel(intelligenceLevel);
                                    System.out.println("success");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case "n":
                                    break;
                                default:
                                    System.out.println("wrong input");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                            }
                        }
                        if ((animal.getClassName()).equals("dolphin")) {
                            System.out.println("current playfulness level: " + getPlayfulness());
                            System.out.println("would you like to change its playfulness level?");
                            System.out.print("type 'y' for yes and 'n' for no:  ");
                            String choice = scanner1.nextLine();
                            switch (choice) {
                                case "y":
                                    System.out.println("enter new playfulness level (integer):  ");
                                    int playfulness = scanner2.nextInt();
                                    animal.setPlayfulness(playfulness);
                                    System.out.println("success");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case "n":
                                    break;
                                default:
                                    System.out.println("wrong input");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                            }
                        }
                        if ((animal.getClassName()).equals("eagle")) {
                            System.out.println("current wings length: " + getWingsLength());
                            System.out.println("would you like to change its wings length?");
                            System.out.print("type 'y' for yes and 'n' for no:  ");
                            String choice = scanner1.nextLine();
                            switch (choice) {
                                case "y":
                                    System.out.println("enter new wings length (double):  ");
                                    double wingsLength = scanner2.nextDouble();
                                    animal.setWingsLength(wingsLength);
                                    System.out.println("success");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case "n":
                                    break;
                                default:
                                    System.out.println("wrong input");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                            }
                        }
                        if ((animal.getClassName()).equals("kangaroo")) {
                            System.out.println("is she a mother? - " + animal.getMother());
                            System.out.println("would you like to change its state of being or not a mother?");
                            System.out.print("type 'y' for yes and 'n' for no:  ");
                            String choice = scanner1.nextLine();
                            switch (choice) {
                                case "y":
                                    boolean mother = false;
                                    if (animal.getMother()) {
                                        animal.setMother(mother);
                                        System.out.println("success");
                                    } else if (!(animal.getMother())) System.out.println("she is already a mother");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case "n":
                                    break;
                                default:
                                    System.out.println("wrong input");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                            }
                        }
                        if ((animal.getClassName()).equals("lion")) {
                            System.out.println("current gender: " + animal.getGender());
                            System.out.println("would you like to change its gender?");
                            System.out.print("type 'y' for yes and 'n' for no:  ");
                            String choice = scanner1.nextLine();
                            switch (choice) {
                                case "y":
                                    if ((animal.getGender()).equals("male"))
                                        animal.setGender("female");
                                    else if ((animal.getGender()).equals("female"))
                                        animal.setGender("male");
                                    System.out.println("success");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case "n":
                                    break;
                                default:
                                    System.out.println("wrong input");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                            }
                        }
                        if ((animal.getClassName()).equals("panda")) {
                            System.out.println("current number of bamboo it owns: " + getBamboo());
                            System.out.println("would you like to change of number of bamboo it owns?");
                            System.out.print("type 'y' for yes and 'n' for no:  ");
                            String choice = scanner1.nextLine();
                            switch (choice) {
                                case "y":
                                    System.out.println("enter new number of bamboo he own (integer):  ");
                                    int newBamboos = scanner2.nextInt();
                                    animal.setBamboo(newBamboos);
                                    System.out.println("success");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case "n":
                                    break;
                                default:
                                    System.out.println("wrong input");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                            }
                        }
                        if ((animal.getClassName()).equals("penguin")) {
                            System.out.println("current color: " + getColor());
                            System.out.println("would you like to change its color?");
                            System.out.print("type 'y' for yes and 'n' for no:  ");
                            String choice = scanner1.nextLine();
                            switch (choice) {
                                case "y":
                                    System.out.println("enter new color:  ");
                                    String newColor = scanner2.nextLine();
                                    animal.setColor(newColor);
                                    System.out.println("success");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case "n":
                                    break;
                                default:
                                    System.out.println("wrong input");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                            }
                        }
                        if ((animal.getClassName()).equals("rhinoceros")) {
                            System.out.println("current horn length: " + getHornLength());
                            System.out.println("would you like to change its horn length?");
                            System.out.print("type 'y' for yes and 'n' for no:  ");
                            String choice = scanner1.nextLine();
                            switch (choice) {
                                case "y":
                                    System.out.println("enter new horn length (double):  ");
                                    double newHornLength = scanner2.nextDouble();
                                    animal.setHornLength(newHornLength);
                                    System.out.println("success");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case "n":
                                    break;
                                default:
                                    System.out.println("wrong input");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                            }
                        }
                        if ((animal.getClassName()).equals("snake")) {
                            System.out.println("current length: " + getLength());
                            System.out.println("would you like to change its length?");
                            System.out.print("type 'y' for yes and 'n' for no:  ");
                            String choice = scanner1.nextLine();
                            switch (choice) {
                                case "y":
                                    System.out.println("enter new length (double):  ");
                                    double newLength = scanner2.nextDouble();
                                    animal.setLength(newLength);
                                    System.out.println("success");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case "n":
                                    break;
                                default:
                                    System.out.println("wrong input");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                            }
                        }
                        if ((animal.getClassName()).equals("spider")) {
                            System.out.println("current eyes number: " + getEyesNumber());
                            System.out.println("would you like to change its eyes number?");
                            System.out.print("type 'y' for yes and 'n' for no:  ");
                            String choice = scanner1.nextLine();
                            switch (choice) {
                                case "y":
                                    System.out.println("enter new eyes number (integer):  ");
                                    int newEyesNumber = scanner2.nextInt();
                                    animal.setEyesNumber(newEyesNumber);
                                    System.out.println("success");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case "n":
                                    break;
                                default:
                                    System.out.println("wrong input");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                            }
                        }
                        if ((animal.getClassName()).equals("giraffe")) {
                            System.out.println("current height: " + getHeight());
                            System.out.println("would you like to change its height?");
                            System.out.print("type 'y' for yes and 'n' for no:  ");
                            String choice = scanner1.nextLine();
                            switch (choice) {
                                case "y":
                                    System.out.println("enter new height (double):  ");
                                    double newHeight= scanner2.nextDouble();
                                    animal.setHeight(newHeight);
                                    System.out.println("success");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case "n":
                                    break;
                                default:
                                    System.out.println("wrong input");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                            }
                        }
                        if ((animal.getClassName()).equals("panther")) {
                            System.out.println("current velocity: " + getVelocity());
                            System.out.println("would you like to change its velocity?");
                            System.out.print("type 'y' for yes and 'n' for no:  ");
                            String choice = scanner1.nextLine();
                            switch (choice) {
                                case "y":
                                    System.out.println("enter new veocity (double):  ");
                                    double newVelocity= scanner2.nextDouble();
                                    animal.setVelocity(newVelocity);
                                    System.out.println("success");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case "n":
                                    break;
                                default:
                                    System.out.println("wrong input");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                            }
                        }
                        if ((animal.getClassName()).equals("zebra")) {
                            System.out.println("current number of stripes: " + getStripesNumber());
                            System.out.println("would you like to change its stripes number?");
                            System.out.print("type 'y' for yes and 'n' for no:  ");
                            String choice = scanner1.nextLine();
                            switch (choice) {
                                case "y":
                                    System.out.println("enter new stripes number (integer):  ");
                                    int newStripesNumber= scanner2.nextInt();
                                    animal.setStripesNumber(newStripesNumber);
                                    System.out.println("success");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case "n":
                                    break;
                                default:
                                    System.out.println("wrong input");
                                    try {
                                        Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                            }
                        }
            }
        }
    }

    //the method below shows information about the animals and also ascii pictures of them
    public static void animalInformation()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("select an animal from below");
        new Zoo().showAnimals();
        System.out.println("enter the number of the animal you are interested in:  ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("                 __,__\n" +
                        "        .--.  .-\"     \"-.  .--.\n" +
                        "       / .. \\/  .-. .-.  \\/ .. \\\n" +
                        "      | |  '|  /   Y   \\  |'  | |\n" +
                        "      | \\   \\  \\ 0 | 0 /  /   / |\n" +
                        "       \\ '- ,\\.-\"`` ``\"-./, -' /\n" +
                        "        `'-' /_   ^ ^   _\\ '-'`\n" +
                        "        .--'|  \\._   _./  |'--. \n" +
                        "      /`    \\   \\ `~` /   /    `\\\n" +
                        "     /       '._ '---' _.'       \\\n" +
                        "    /           '~---~'   |       \\\n" +
                        "   /        _.             \\       \\\n" +
                        "  /   .'-./`/        .'~'-.|\\       \\\n" +
                        " /   /    `\\:       /      `\\'.      \\\n" +
                        "/   |       ;      |         '.`;    /\n" +
                        "\\   \\       ;      \\           \\/   /\n" +
                        " '.  \\      ;       \\       \\   `  /\n" +
                        "   '._'.     \\       '.      |   ;/_\n" +
                        "jgs  /__>     '.       \\_ _ _/   ,  '--.\n" +
                        "   .'   '.   .-~~~~~-. /     |--'`~~-.  \\\n" +
                        "  // / .---'/  .-~~-._/ / / /---..__.'  /\n" +
                        " ((_(_/    /  /      (_(_(_(---.__    .'\n" +
                        "           | |     _              `~~`\n" +
                        "           | |     \\'.\n" +
                        "            \\ '....' |\n" +
                        "             '.,___.'");
                System.out.println("""
                        The chimpanzee (Pan troglodytes), also known simply as chimp,\s
                        is a species of great ape native to the forest and savannah of tropical Africa.
                        It has four confirmed subspecies and a fifth proposed subspecies.\s
                        The chimpanzee and the closely related bonobo are classified in the genus Pan.\s
                        Evidence from fossils and DNA sequencing shows that Pan is a sister taxon to the human lineage\s
                        and is humans' closest living relative. The chimpanzee is covered in coarse black hair,\s
                        but has a bare face, fingers, toes, palms of the hands, and soles of the feet.\s
                        It is larger and more robust than the bonobo, weighing 40–70 kg (88–154 lb) for males
                        and 27–50 kg (60–110 lb) for females and standing 120 to 150 cm (3 ft 11 in to 4 ft 11 in).
                        """);
                try {
                    Thread.sleep(120000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            case 2:
                System.out.println("                                    _\n" +
                        "                               _.-~~.)\n" +
                        "         _.--~~~~~---....__  .' . .,'\n" +
                        "       ,'. . . . . . . . . .~- ._ (\n" +
                        "      ( .. .g. . . . . . . . . . .~-._\n" +
                        "   .~__.-~    ~`. . . . . . . . . . . -.\n" +
                        "   `----..._      ~-=~~-. . . . . . . . ~-.\n" +
                        "             ~-._   `-._ ~=_~~--. . . . . .~.\n" +
                        "              | .~-.._  ~--._-.    ~-. . . . ~-.\n" +
                        "               \\ .(   ~~--.._~'       `. . . . .~-.                ,\n" +
                        "                `._\\         ~~--.._    `. . . . . ~-.    .- .   ,'/\n" +
                        "_  . _ . -~\\        _ ..  _          ~~--.`_. . . . . ~-_     ,-','`  .\n" +
                        "             ` ._           ~                ~--. . . . .~=.-'. /. `\n" +
                        "       - . -~            -. _ . - ~ - _   - ~     ~--..__~ _,. /   \\  - ~\n" +
                        "              . __ ..                   ~-               ~~_. (  `\n" +
                        ")`. _ _               `-       ..  - .    . - ~ ~ .    \\    ~-` ` `  `. _\n" +
                        "      _ Seal _");
                System.out.println("""
                        A dolphin is an aquatic mammal within the infraorder Cetacea. Dolphin species belong
                        to the families Delphinidae (the oceanic dolphins), Platanistidae (the Indian river dolphins),
                        Iniidae (the New World river dolphins), Pontoporiidae (the brackish dolphins), and the extinct
                        Lipotidae (baiji or Chinese river dolphin). There are 40 extant species named as dolphins.
                        Dolphins range in size from the 1.7-metre-long (5 ft 7 in) and 50-kilogram (110-pound) Maui's
                        dolphin to the 9.5 m (31 ft 2 in) and 10-tonne (11-short-ton) orca. Several species of dolphins
                         exhibit sexual dimorphism, in that the males are larger than females.
                        They have streamlined bodies and two limbs that are modified into flippers.
                         Though not quite as flexible as seals, some dolphins can briefly travel at speeds
                         of 29 kilometres (18 mi) per hour or leap about 30 feet (9.1 m). Dolphins use their conical
                         teeth to capture fast-moving prey. They have well-developed hearing which is adapted
                        for both air and water. It is so well developed that some can survive even if they are blind.
                        Some species are well adapted for diving to great depths. They have a layer of fat, or blubber,
                         under the skin to keep warm in the cold water.""");
                try {
                    Thread.sleep(120000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            case 3:
                System.out.println("                               /T /I\n" +
                        "                              / |/ | .-~/\n" +
                        "                          T\\ Y  I  |/  /  _\n" +
                        "         /T               | \\I  |  I  Y.-~/\n" +
                        "        I l   /I       T\\ |  |  l  |  T  /\n" +
                        " __  | \\l   \\l  \\I l __l  l   \\   `  _. |\n" +
                        " \\ ~-l  `\\   `\\  \\  \\\\ ~\\  \\   `. .-~   |\n" +
                        "  \\   ~-. \"-.  `  \\  ^._ ^. \"-.  /  \\   |\n" +
                        ".--~-._  ~-  `  _  ~-_.-\"-.\" ._ /._ .\" ./\n" +
                        " >--.  ~-.   ._  ~>-\"    \"\\\\   7   7   ]\n" +
                        "^.___~\"--._    ~-{  .-~ .  `\\ Y . /    |\n" +
                        " <__ ~\"-.  ~       /_/   \\   \\I  Y   : |\n" +
                        "   ^-.__           ~(_/   \\   >._:   | l______\n" +
                        "       ^--.,___.-~\"  /_/   !  `-.~\"--l_ /     ~\"-.\n" +
                        "              (_/ .  ~(   /'     \"~\"--,Y   -=b-. _)\n" +
                        "               (_/ .  \\  :           / l      c\"~o \\\n" +
                        "                \\ /    `.    .     .^   \\_.-~\"~--.  )\n" +
                        "                 (_/ .   `  /     /       !       )/\n" +
                        "                  / / _.   '.   .':      /        '\n" +
                        "                  ~(_/ .   /    _  `  .-<_\n" +
                        "                    /_/ . ' .-~\" `.  / \\  \\          ,z=.\n" +
                        "                    ~( /   '  :   | K   \"-.~-.______//\n" +
                        "                      \"-,.    l   I/ \\_    __{--->._(==.\n" +
                        "                       //(     \\  <    ~\"~\"     //\n" +
                        "                      /' /\\     \\  \\     ,v=.  ((\n" +
                        "                    .^. / /\\     \"  }__ //===-  `\n" +
                        "                   / / ' '  \"-.,__ {---(==-\n" +
                        "                 .^ '       :  T  ~\"   ll       -Row\n" +
                        "                / .  .  . : | :!        \\\\\n" +
                        "               (_/  /   | | j-\"          ~^\n" +
                        "                 ~-<_(_.^-~\"");
                System.out.println("""
                        Eagles are large, powerfully built birds of prey, with heavy heads and beaks.
                        Even the smallest eagles, such as the booted eagle (Aquila pennata), which is comparable
                        in size to a common buzzard (Buteo buteo) or red-tailed hawk (B. jamaicensis), have relatively
                        longer and more evenly broad wings, and more direct, faster flight – despite the reduced size
                        of aerodynamic feathers. Most eagles are larger than any other raptors apart from some vultures.
                        The smallest species of eagle is the South Nicobar serpent eagle (Spilornis klossi),
                        at 450 g (1 lb) and 40 cm (16 in). The largest species are discussed below. Like all birds of prey,
                        eagles have very large hooked beaks for ripping flesh from their prey, strong, muscular legs,
                        and powerful talons. The beak is typically heavier than that of most other birds of prey.
                        Eagles' eyes are extremely powerful. It is estimated that the martial eagle, whose eyes
                        are more than two times larger than the human eye, has a visual acuity up to 8 times that of humans.
                        This acuity enables eagles to spot potential prey from a very long distance.
                        This keen eyesight is primarily attributed to their extremely large pupils which ensure minimal
                        diffraction (scattering) of the incoming light. The female of all known species of eagles is
                        larger than the male.""");
                try {
                    Thread.sleep(120000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            case 4:
                System.out.println("                                 .\n" +
                        "                             /\\ /l\n" +
                        "                            ((.Y(!\n" +
                        "                             \\ |/\n" +
                        "                             /  6~6,\n" +
                        "                             \\ _    +-.\n" +
                        "                              \\`-=--^-'\n" +
                        "                               \\ \\\n" +
                        "                              _/  \\\n" +
                        "                             (  .  Y\n" +
                        "                            /\"\\ `--^--v--.\n" +
                        "                           / _ `--\"T~\\/~\\/\n" +
                        "                          / \" ~\\.  !\n" +
                        "                    _    Y      Y./'\n" +
                        "                   Y^|   |      |~~7\n" +
                        "                   | l   |     / ./'\n" +
                        "                   | `L  | Y .^/~T\n" +
                        "                   |  l  ! | |/| |\n" +
                        "                   | .`\\/' | Y | !   \n" +
                        "                   l  \"~   j l j_L______\n" +
                        "                    \\,____{ __\"~ __ ,\\_,\\_\n" +
                        "                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("""
                        Kangaroos have large, powerful hind legs, large feet adapted for leaping,
                        a long muscular tail for balance, and a small head. Like most marsupials, female kangaroos have
                        a pouch called a marsupium in which joeys complete postnatal development.
                        Because of its grazing habits, the kangaroo has developed specialized teeth that are rare among mammals.
                        Its incisors are able to crop grass close to the ground and its molars chop and grind the grass.
                        Since the two sides of the lower jaw are not joined or fused together, the lower incisors are farther
                        apart, giving the kangaroo a wider bite. The silica in grass is abrasive, so kangaroo molars
                        are ground down and they actually move forward in the mouth before they eventually fall out,
                        and are replaced by new teeth that grow in the back. This process is known as polyphyodonty and,
                        amongst other mammals, only occurs in elephants and manatees.""");
                try {
                    Thread.sleep(120000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            case 5:
                System.out.println("                                  \\\\\\\\\\\\\\////\n" +
                        "                             \\\\//\\/\\\\\\\\\\\\\\///\n" +
                        "                           \\\\\\`      \\\\\\\\\\\\///\n" +
                        "                          \\\\       ||\\      \\\n" +
                        "                          \\  \\\\   //     _\\  `\\\n" +
                        "                         /  /. \\  \\\\    /O.    `\\,\n" +
                        "                        //  |__\\\\ //\\         . __\\\n" +
                        "                      /`           //\\\\      , .\\ /\n" +
                        "                     \\\\\\\\          //\\        ___|\n" +
                        "                    ////\\\\            \\\\     `   \\\n" +
                        "                  //////////\\\\\\\\       //__       |\n" +
                        "                 |`  \\\\\\//////\\\\        \\_ \\______|\n" +
                        "                 |     \\\\\\\\//\\\\/////\\\\\\   \\\n" +
                        "                ./      \\\\\\\\////////\\\\     |\\\n" +
                        "                |        \\\\\\\\////\\\\//\\\\\\\\\\\\\\\\\n" +
                        "                |          \\\\\\///      \\\\\\\\\\\\\n" +
                        "                |          \\\\\\//         \\//\n" +
                        "                |            \\/        \\ |\n" +
                        "                |             `         \\|\n" +
                        "                | |                      \\                       /\n" +
                        "                | |           \\           \\                     //\n" +
                        "                | |                        \\                   ////\n" +
                        "                | |             .          `|                 /////\n" +
                        "                | |                         `\\                \\\\////\n" +
                        "                 \\`|                          `|              \\\\||/\n" +
                        "                  | |             \\            `|  ,--.         \\ \\,\n" +
                        "                  |  \\                          |./    `\\        | |\n" +
                        "                   |  |                                 |        | |\n" +
                        "                   |___|            .                   |        | |\n" +
                        "                   /   |                                |        | |\n" +
                        "                   |    |                               ;        | |\n" +
                        "                   |                                    |        | |\n" +
                        "                 __|                                   /`       /` ;\n" +
                        "                /   \\                          ,      ; \\     ,` ,/\n" +
                        "                \\____\\              \\       \\,/__________|__.' ,`\n" +
                        "                  nmf \\______________\\_______________________.'");
                System.out.println("""
                        The lion (Panthera leo) is a large cat of the genus Panthera native to Africa and India.
                        It has a muscular, broad-chested body, short, rounded head, round ears, and a hairy tuft
                        at the end of its tail. It is sexually dimorphic; adult male lions are larger than females
                        and have a prominent mane. It is a social species, forming groups called prides. A lion's pride
                        consists of a few adult males, related females, and cubs. Groups of female lions usually hunt together,
                        preying mostly on large ungulates. The lion is an apex and keystone predator, although some lions
                        scavenge when opportunities occur and have been known to hunt humans, the species typically
                        does not actively seek out and prey on humans.
                        The lion inhabits grasslands, savannas and shrublands. It is usually more diurnal than other wild cats,
                        but when persecuted, it adapts to being active at night and at twilight. During the Neolithic period,
                        the lion ranged throughout Africa, Southeast Europe, the Caucasus, and Western and South Asia,
                        but it has been reduced to fragmented populations in sub-Saharan Africa and one population in western India.
                        It has been listed as Vulnerable on the IUCN Red List since 1996 because populations in African
                        countries have declined by about 43% since the early 1990s. Lion populations are untenable outside
                        designated protected areas. Although the cause of the decline is not fully understood, habitat loss
                        and conflicts with humans are the greatest causes for concern.""");
                try {
                    Thread.sleep(120000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            case 6:
                System.out.println("                              _,add8ba,\n" +
                        "                            ,d888888888b,\n" +
                        "                           d8888888888888b                        _,ad8ba,_\n" +
                        "                          d888888888888888)                     ,d888888888b,\n" +
                        "                          I8888888888888888 _________          ,8888888888888b\n" +
                        "                __________`Y88888888888888P\"\"\"\"\"\"\"\"\"\"\"baaa,__ ,888888888888888,\n" +
                        "            ,adP\"\"\"\"\"\"\"\"\"\"\"9888888888P\"\"^                 ^\"\"Y8888888888888888I\n" +
                        "         ,a8\"^           ,d888P\"888P^                           ^\"Y8888888888P'\n" +
                        "       ,a8^            ,d8888'                                     ^Y8888888P'\n" +
                        "      a88'           ,d8888P'                                        I88P\"^\n" +
                        "    ,d88'           d88888P'                                          \"b,\n" +
                        "   ,d88'           d888888'                                            `b,\n" +
                        "  ,d88'           d888888I                                              `b,\n" +
                        "  d88I           ,8888888'            ___                                `b,\n" +
                        " ,888'           d8888888          ,d88888b,              ____            `b,\n" +
                        " d888           ,8888888I         d88888888b,           ,d8888b,           `b\n" +
                        ",8888           I8888888I        d8888888888I          ,88888888b           8,\n" +
                        "I8888           88888888b       d88888888888'          8888888888b          8I\n" +
                        "d8886           888888888       Y888888888P'           Y8888888888,        ,8b\n" +
                        "88888b          I88888888b      `Y8888888^             `Y888888888I        d88,\n" +
                        "Y88888b         `888888888b,      `\"\"\"\"^                `Y8888888P'       d888I\n" +
                        "`888888b         88888888888b,                           `Y8888P^        d88888\n" +
                        " Y888888b       ,8888888888888ba,_          _______        `\"\"^        ,d888888\n" +
                        " I8888888b,    ,888888888888888888ba,_     d88888888b               ,ad8888888I\n" +
                        " `888888888b,  I8888888888888888888888b,    ^\"Y888P\"^      ____.,ad88888888888I\n" +
                        "  88888888888b,`888888888888888888888888b,     \"\"      ad888888888888888888888'\n" +
                        "  8888888888888698888888888888888888888888b_,ad88ba,_,d88888888888888888888888\n" +
                        "  88888888888888888888888888888888888888888b,`\"\"\"^ d8888888888888888888888888I\n" +
                        "  8888888888888888888888888888888888888888888baaad888888888888888888888888888'\n" +
                        "  Y8888888888888888888888888888888888888888888888888888888888888888888888888P\n" +
                        "  I888888888888888888888888888888888888888888888P^  ^Y8888888888888888888888'\n" +
                        "  `Y88888888888888888P88888888888888888888888888'     ^88888888888888888888I\n" +
                        "   `Y8888888888888888 `8888888888888888888888888       8888888888888888888P'\n" +
                        "    `Y888888888888888  `888888888888888888888888,     ,888888888888888888P'\n" +
                        "     `Y88888888888888b  `88888888888888888888888I     I888888888888888888'\n" +
                        "       \"Y8888888888888b  `8888888888888888888888I     I88888888888888888'\n" +
                        "         \"Y88888888888P   `888888888888888888888b     d8888888888888888'\n" +
                        "            ^\"\"\"\"\"\"\"\"^     `Y88888888888888888888,    888888888888888P'\n" +
                        "                  Normand    \"8888888888888888888b,   Y888888888888P^\n" +
                        "                  Veilleux    `Y888888888888888888b   `Y8888888P\"^\n" +
                        "                                \"Y8888888888888888P     `\"\"\"\"^\n" +
                        "                                  `\"YY88888888888P'\n" +
                        "                                       ^\"\"\"\"\"\"\"\"'");
                System.out.println("""
                        The giant panda (Ailuropoda melanoleuca), also known as the panda bear (or simply the panda),
                        is a bear species endemic to China. It is characterised by its bold black-and-white coat and rotund body.
                        The name "giant panda" is sometimes used to distinguish it from the red panda, a neighboring musteloid.
                        Though it belongs to the order Carnivora, the giant panda is a folivore, with bamboo shoots
                        and leaves making up more than 99% of its diet. Giant pandas in the wild occasionally eat other grasses,
                        wild tubers, or even meat in the form of birds, rodents, or carrion. In captivity, they may receive honey,
                        eggs, fish, yams, shrub leaves, oranges, or bananas along with specially prepared food.
                        The giant panda lives in a few mountain ranges in central China, mainly in Sichuan, but also
                        in neighbouring Shaanxi and Gansu. As a result of farming, deforestation, and other development,
                        the giant panda has been driven out of the lowland areas where it once lived, and it is
                        a conservation-reliant vulnerable species. A 2007 report showed 239 pandas living in captivity
                        inside China and another 27 outside the country. As of December 2014, 49 giant pandas lived
                        in captivity outside China, living in 18 zoos in 13 countries. Wild population estimates vary;
                        one estimate shows that there are about 1,590 individuals living in the wild, while a 2006 study
                        via DNA analysis estimated that this figure could be as high as 2,000 to 3,000.
                        """);
                try {
                    Thread.sleep(120000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            case 7:
                System.out.println("             . --- .\n" +
                        "           /        \\\n" +
                        "          |  O  _  O |\n" +
                        "          |  ./   \\. |\n" +
                        "          /  `-._.-'  \\\n" +
                        "        .' /         \\ `.\n" +
                        "    .-~.-~/           \\~-.~-.\n" +
                        ".-~ ~    |             |    ~ ~-.\n" +
                        "`- .     |             |     . -'\n" +
                        "     ~ - |             | - ~\n" +
                        "         \\             /\n" +
                        "       ___\\           /___\n" +
                        "       ~;_  >- . . -<  _i~\n" +
                        "          `'         `'");
                System.out.println("""
                        Penguins (order Sphenisciformes, family Spheniscidae) are a group of aquatic flightless birds.
                        They live almost exclusively in the Southern Hemisphere: only one species, the Galápagos penguin,
                        is found north of the Equator. Highly adapted for life in the water, penguins have countershaded dark
                        and white plumage and flippers for swimming. Most penguins feed on krill, fish, squid and other
                        forms of sea life which they catch with their bills and swallow it whole while swimming.
                        A penguin has a spiny tongue and powerful jaws to grip slippery prey.
                        They spend roughly half of their lives on land and the other half in the sea.
                        The largest living species is the Emperor penguin (Aptenodytes forsteri) on average,
                        adults are about 1.1 m (3 ft 7 in) tall and weigh 35 kg (77 lb). The smallest penguin species is
                        the little blue penguin (Eudyptula minor), also known as the fairy penguin, which stands around
                        33 cm (13 in) tall and weighs 1 kg (2.2 lb). Today, larger penguins generally inhabit colder regions,
                        and smaller penguins inhabit regions with temperate or tropical climates. Some prehistoric
                        penguin species were enormous: as tall or heavy as an adult human. There was a great diversity
                        of species in subantarctic regions, and at least one giant species in a region around 2,000 km
                        south of the equator 35 mya, in a climate decidedly warmer than today.""");
                try {
                    Thread.sleep(120000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            case 8:
                System.out.println("      __.--**\"\"\"**--...__..--**\"\"\"\"*-.            \n" +
                        "    .'                                `-.         \n" +
                        "  .'                         _           \\        \n" +
                        " /                         .'        .    \\   _._ \n" +
                        ":                         :          :`*.  :-'.' ;\n" +
                        ";    `                    ;          `.) \\   /.-' \n" +
                        ":     `                             ; ' -*   ;    \n" +
                        "       :.    \\           :       :  :        :    \n" +
                        " ;     ; `.   `.         ;     ` |  '             \n" +
                        " |         `.            `. -*\"*\\; /        :     \n" +
                        " |    :     /`-.           `.    \\/`.'  _    `.   \n" +
                        " :    ;    :    `*-.__.-*\"\"\":`.   \\ ;  'o` `. /   \n" +
                        "       ;   ;                ;  \\   ;:       ;:   ,/\n" +
                        "  |  | |            [bug]      /`  | ,      `*-*'/ \n" +
                        "  `  : :  :                /  /    | : .    ._.-'  \n" +
                        "   \\  \\ ,  \\              :   `.   :  \\ \\   .'     \n" +
                        "    :  *:   ;             :    |`*-'   `*+-*       \n" +
                        "    `**-*`\"\"               *---*");
                System.out.println("""
                        A rhinoceros (from Ancient Greek ῥῑνόκερως (rhīnókerōs) 'nose-horned'
                        from ῥῑνός (rhīnós) 'nose', and κέρας (kéras) 'horn'), commonly abbreviated to rhino,
                        is a member of any of the five extant species (or numerous extinct species) of odd-toed ungulates
                        in the family Rhinocerotidae. (It can also refer to a member of any of the extinct species
                        of the superfamily Rhinocerotoidea.) Two of the extant species are native to Africa,
                        and three to South and Southeast Asia.
                        Rhinoceroses are some of the largest remaining megafauna: all weigh at least one tonne in adulthood.
                        They have a herbivorous diet, small brains (400–600 g) for mammals of their size, one or two horns,
                        and a thick (1.5–5 cm), protective skin formed from layers of collagen positioned in a lattice structure.
                        They generally eat leafy material, although their ability to ferment food in their hindgut
                        allows them to subsist on more fibrous plant matter when necessary. Unlike other perissodactyls,
                        the two African species of rhinoceros lack teeth at the front of their mouths, but they rely instead
                        on their lips to pluck food.
                        """);
                try {
                    Thread.sleep(120000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            case 9:
                System.out.println("                            __..._              \n" +
                        "                        ..-'      o.            \n" +
                        "                     .-'            :           \n" +
                        "                 _..'             .'__..--<     \n" +
                        "          ...--\"\"                 '-.           \n" +
                        "      ..-\"                       __.'           \n" +
                        "    .'                  ___...--'               \n" +
                        "   :        ____....---'                        \n" +
                        "  :       .'                                    \n" +
                        " :       :           _____                      \n" +
                        " :      :    _..--\"\"\"     \"\"\"--..__             \n" +
                        ":       :  .\"                      \"\"i--.       \n" +
                        ":       '.:                         :    '.     \n" +
                        ":         '--...___i---\"\"\"\"--..___.'      :     \n" +
                        " :                 \"\"---...---\"\"          :     \n" +
                        "  '.                                     :      \n" +
                        "    '-.                                 :       \n" +
                        "       '--...                         .'        \n" +
                        "         :   \"\"---....._____.....---\"\"          \n" +
                        "         '.    '.                               \n" +
                        "           '-..  '.                             \n" +
                        "               '.  :                            \n" +
                        "          fsc   : .'                            \n" +
                        "               /  :                             \n" +
                        "             .'   :                             \n" +
                        "           .' .--'                              \n" +
                        "          '--'");
                System.out.println("""
                        Snakes are elongated, limbless, carnivorous reptiles of the suborder Serpentes.
                        Like all other squamates, snakes are ectothermic, amniote vertebrates covered in overlapping scales.
                        Many species of snakes have skulls with several more joints than their lizard ancestors,
                        enabling them to swallow prey much larger than their heads (cranial kinesis). To accommodate
                        their narrow bodies, snakes' paired organs (such as kidneys) appear one in front of the other
                        instead of side by side, and most have only one functional lung. Some species retain a pelvic
                        girdle with a pair of vestigial claws on either side of the cloaca. Lizards have evolved elongate
                        bodies without limbs or with greatly reduced limbs about twenty-five times independently
                        via convergent evolution, leading to many lineages of legless lizards. These resemble snakes,
                        but several common groups of legless lizards have eyelids and external ears, which snakes lack,
                        although this rule is not universal (see Amphisbaenia, Dibamidae, and Pygopodidae).
                        Living snakes are found on every continent except Antarctica, and on most smaller land masses;
                        exceptions include some large islands, such as Ireland, Iceland, Greenland, the Hawaiian archipelago,
                        and the islands of New Zealand, as well as many small islands of the Atlantic and central Pacific oceans.
                        Additionally, sea snakes are widespread throughout the Indian and Pacific oceans.
                        More than twenty families are currently recognized, comprising about 520 genera and about 3,900 species.""");
                try {
                    Thread.sleep(120000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            case 10:
                System.out.println("           ____                      ,\n" +
                        "          /---.'.__             ____//\n" +
                        "               '--.\\           /.---'\n" +
                        "          _______  \\\\         //\n" +
                        "        /.------.\\  \\|      .'/  ______\n" +
                        "       //  ___  \\ \\ ||/|\\  //  _/_----.\\__\n" +
                        "      |/  /.-.\\  \\ \\:|< >|// _/.'..\\   '--'\n" +
                        "         //   \\'. | \\'.|.'/ /_/ /  \\\\\n" +
                        "        //     \\ \\_\\/\" ' ~\\-'.-'    \\\\\n" +
                        "       //       '-._| :H: |'-.__     \\\\\n" +
                        "      //           (/'==='\\)'-._\\     ||\n" +
                        "      ||                        \\\\    \\|\n" +
                        "      ||                         \\\\    '\n" +
                        "snd   |/                          \\\\\n" +
                        "                                   ||\n" +
                        "                                   ||\n" +
                        "                                   \\\\\n" +
                        "                                    '");
                System.out.println("""
                        Spiders (order Araneae) are air-breathing arthropods that have eight legs, chelicerae
                        with fangs generally able to inject venom, and spinnerets that extrude silk. They are\s
                        the largest order of arachnids and rank seventh in total species diversity among all orders of organisms.
                        Spiders are found worldwide on every continent except for Antarctica, and have become
                        established in nearly every land habitat. As of August 2021, 49,623 spider species in 129 families
                        have been recorded by taxonomists. However, there has been dissension within the scientific
                        community as to how all these families should be classified, as evidenced by the over 20 different
                        classifications that have been proposed since 1900.
                        Anatomically, spiders (as with all arachnids) differ from other arthropods in that the usual body
                        segments are fused into two tagmata, the cephalothorax or prosoma, and the opisthosoma, or abdomen,
                        and joined by a small, cylindrical pedicel, however, as there is currently neither paleontological
                        nor embryological evidence that spiders ever had a separate thorax-like division,
                        there exists an argument against the validity of the term cephalothorax, which means fused cephalon (head)
                        and the thorax. Similarly, arguments can be formed against use of the term abdomen,
                        as the opisthosoma of all spiders contains a heart and respiratory organs, organs atypical of an abdomen.
                        """);
                try {
                    Thread.sleep(120000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            case 11:
                System.out.println("                    oo _,        ,\n" +
                        "                  _((-'_/       |\n" +
                        "                 /      \"\",   _//__,     __/\n" +
                        "               ,',O`  | #  \",/.---'     /,-'\n" +
                        "             ,'    __/-.   # \"       \\.//\n" +
                        "        |`._(;_,--'     \\     \"       ||\n" +
                        "         `-.\\           ,\\ #   \",     ||\n" +
                        "           _\\\\         || \\   #  \"    ||\n" +
                        "         /,-.`\\       //   \\      \"  //\n" +
                        "        //   `.`.    ||   | \\ #  # \",/\n" +
                        "        |      `.`._// \\ //  \\     # \",\n" +
                        "                 `-.:\\  ||    \\  #     \",\n" +
                        "      \\`.___     // \\:\\ \\\\     \\  #  #   \",\n" +
                        "    ,--'----.\\  ||   \\:\\ ||   //\\         #\",\n" +
                        "             \\\\//    | | ||  //  \\#    #     \",_\n" +
                        "              |:|    |:|  \\\\//    \\  #    #     `--.__\n" +
                        "             /:/     |:|   \\\\      \\     #    #     # `--._\n" +
                        "            / /      | |    ||     |#      #          #    `-.\n" +
                        "    \\-     /:/    /| | |    ||     ;   #       #   #        # \\\n" +
                        "     \\\\__ |:|   _//  |:|    ||    :     #   #       #   #      \\\n" +
                        "      `-.\\| |  /,-   |:|   //     :  #    #      #     #  /  #  :\n" +
                        "         \\ :| //     |:|  //_     : # |  #               /    # |\\\n" +
                        "          \\:|//      \\ \\_/ / \\\\   :   :        |#     # | #     |\\\\\n" +
                        "          |: /    /|  \\ ::/   `    \\ # \\   #   |  #     |      #| \\\\\n" +
                        "          / / \\_ //   | : |         \\  #\\#  #  |       ,|  #    | ||\n" +
                        "         | |    ||   / ::/           |   \\     |# __,.' \\    #  | ||\n" +
                        "         |:|     \\\\ /:: /            | #/ |#  /-'' `. #  \\     #; ||\n" +
                        "          \\:\\     \\\\:::/             |  | |  |       \\  # \\ #  /  ||\n" +
                        "          | |     / ::/              |  | | #|        |  | |  /   ||\n" +
                        "          | |     | : |              |# | |  |        |  | |# |   ;; \n" +
                        "          |:|    / ::/               |  | | #|        |# | |  |  .;;.\n" +
                        "           \\:\\   |:::|               |  | |  |        |  | | #|  ;;;;\n" +
                        "           |:|  /:: /                | #| |  |        | #| |  |  ;;;;\n" +
                        "           |:| / : / _  _            |  | |# |  __   _(  ) (  )  ;;;;\n" +
                        "           | |\\|   |/ //  _    _    _(  ) (  ) _ \\\\\\//| / \\| /  _ _   \n" +
                        "           | :\\|:: |/ ////_ _  _\\\\ / _\\ |  \\ | _\\ \\|//| |\\\\| |\\/// _ __\n" +
                        "            \\ :| :_|/ /// _  \\\\ \\\\|///| |  | |_\\\\\\\\ |/| |\\\\| |\\//////_\n" +
                        "          _ | _  / |_//     \\\\ \\\\\\|///| |  | | \\\\ \\||_| |_\\|_|\\/ // /\n" +
                        "       _  _\\ _ \\//:/  _  _ _ \\_\\_\\\\/_/| |  | | __   _ \\\\\\ \\/ |/  _  \n" +
                        "     _  \\\\ \\\\ \\|||/_ / _  \\ \\/// _  _\\\\_|  | |  _  _ \\\\ \\|||/ //  _\n" +
                        "       \\\\ \\\\\\\\\\_|\\\\\\//_ \\\\\\ \\|/_  \\\\ \\\\\\\\\\//_|//   _\\\\\\ \\\\||/ ////_\n" +
                        "     jrei \\ \\_\\_\\\\\\|////\\ _\\\\\\|//\\\\ \\\\\\ \\| // / ///_\\ \\\\\\|| /// /\n" +
                        "             _\\\\\\\\\\ |/////_ \\|/// _\\\\ \\\\\\||// ///__   \\\\ \\\\|// /\n" +
                        "              \\\\\\ \\||/ ///         \\ \\\\ \\|// // //");
                System.out.println("""
                        The giraffe is a tall African hoofed mammal belonging to the genus Giraffa.
                        It is the tallest living terrestrial animal and the largest ruminant on Earth. Traditionally,
                        giraffes were thought to be one species, Giraffa camelopardalis, with nine subspecies.
                        Most recently, researchers proposed dividing them into up to eight extant species due to new research
                        into their mitochondrial and nuclear DNA, as well as morphological measurements.
                        Seven other extinct species of Giraffa are known from the fossil record.
                        The giraffe's chief distinguishing characteristics are its extremely long neck and legs,
                        its horn-like ossicones, and its spotted coat patterns. It is classified under the family Giraffidae,
                        along with its closest extant relative, the okapi. Its scattered range extends from Chad in the north
                        to South Africa in the south, and from Niger in the west to Somalia in the east. Giraffes usually
                        inhabit savannahs and woodlands. Their food source is leaves, fruits, and flowers of woody plants,
                        primarily acacia species, which they browse at heights most other herbivores cannot reach.""");
                try {
                    Thread.sleep(120000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            case 12:
                System.out.println("                                                           _...---.._\n" +
                        "                                                       _.'`       -_ ``.\n" +
                        "                                                   .-'`                 `.\n" +
                        "                                                .-`                     q ;\n" +
                        "                                             _-`                       __  \\\n" +
                        "                                         .-'`                  . ' .   \\ `;/\n" +
                        "                                     _.-`                    /.      `._`/\n" +
                        "                             _...--'`                        \\_`..._\n" +
                        "                          .'`                         -         `'--:._\n" +
                        "                       .-`                           \\                  `-.\n" +
                        "                      .                `              `-..__.....----...., `.\n" +
                        "                     '                 `  '''---..-''`'              : :  : :\n" +
                        "                   .` -                '`.  `-.                       `'   `'\n" +
                        "                .-` .` '             .`'.__ ;\n" +
                        "            _.-` .-`   '            .\n" +
                        "        _.-` _.-`    .' '         .`\n" +
                        "(`''--'' _.-`      .'  '        .'\n" +
                        " `'----''        .'  .`       .`\n" +
                        "               .'  .'     .-'`\n" +
                        "             .'   :    .-`\n" +
                        "             `. .`   ,`\n" +
                        "              .'   .'\n" +
                        "             '   .`\n" +
                        "            '  .`\n" +
                        "            `  '.\n" +
                        "            `.___;\n");
                System.out.println("""
                        Panthera is a genus within the family Felidae that was named and described by Lorenz Oken
                        in 1816 who placed all the spotted cats in this group. Reginald Innes Pocock revised
                        the classification of this genus in 1916 as comprising the tiger (P. tigris), lion (P. leo),
                        jaguar (P. onca), and leopard (P. pardus) on the basis of common cranial features.
                        Results of genetic analysis indicate that the snow leopard (formerly Uncia uncia) also belongs
                        to the genus Panthera (P. uncia), a classification that was accepted by IUCN Red List assessors in 2008.
                        The tiger, lion, jaguar and leopard are the only cat species with anatomical structures that
                        enable them to roar. The snow leopard is the only one in this genus that cannot roar.
                        The primary reason for this was formerly assumed to be the incomplete ossification of the hyoid bone.
                        However, new studies show the ability to roar is due to other morphological features,
                        especially of the larynx.""");
                try {
                    Thread.sleep(120000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            case 13:
                System.out.println("\n" +
                        "                           ,, ,,, ,,,, ,,,,,,,,\n" +
                        "              /\\        /;; ;;;;;;;;;;;;;; ;;;/ ,;`.   ,,,,\n" +
                        "             ;  `-.    /// //////// /////  // ,','`;. ///;;;;,.\n" +
                        "            ,'   ,,`-.;;;;;; ;;;;;;; ;;;;// ,' ,'  `.`. ///;;//;,\n" +
                        "           ,'   ;;;//////// ////// ///////,'  ,'     ; : ;;// ;//,\n" +
                        "           `.  ;`;;;;;;;: ;;;;:;; ;:;:;;:;:  ,'     ,' : ;;;;;;;;/,\n" +
                        "            `. `; :!::::!;;;;;!::::!;!;;!;:  `.   ,'  ,'///!!;;;;;;\n" +
                        "              `._!!;!!!!;!!!!!;!!!!;!;!!;!!`.  `;'  ,'-.!!!//;;;////\n" +
                        "                 ;   .   .               ,        ,'    ::-!_///;;;;\n" +
                        "               .' ,%'  ,%'     `%.   `%.;;   `%.   ;;   ,::  `! ////\n" +
                        "              .', '    '    `%,  `:.   `::.   ::  :;    %::    `! ;;\n" +
                        "             ,';;        `%, `;;.         `::. `.;;;    `:%   %:///\n" +
                        "            ,';;'  ;      ;;  `::;   `%,    ;%:.  ::     ::     %`!/\n" +
                        "          ,' ;.'  .%.    ;;    `;;     ;;   ' `;   %     ::    %  :\n" +
                        "          :  `;;  %%%    `::   ;;     ;;;      `    `    ::     % `\n" +
                        "          ;    ' .%%'  `%  ;   '  ,., `;;         `%,   ::'   %::%\n" +
                        "         ;`. `.  %%%%   ;;   .___;;;;  '     `:    `;   ::     :::\n" +
                        "         : :  ;  %%%%   ;: ,:' _ `.`.        ;;;   ;;   `::    :::.\n" +
                        "         `.;  ;  `%%'  ;;' :: (0) ; :       ::'    ;      ::   `:::\n" +
                        "          ,' ;'  %%'  ;;'  ;;.___,',;       ;;    ;;       ;   ,:::\n" +
                        "         ,  ;'  :%:   ;;  ,'------''      ;;;'  .;;            :::'\n" +
                        "        ,' ;;   ;%;   ;;  '             ::'    ,;;;            :::\n" +
                        "        :  :'   :%:   `;             ;;;;'      ;;             ::%\n" +
                        "        :  ;;   :%'   ;;   ;...,,;;''         ;;'    ;     ;   :::\n" +
                        "        ;  `;   ::   ;;' ,:::'     .        .;;     ,'    ;;   `;;\n" +
                        "        ;  ;'   :: .;;' ,:::'   ,::%.      ;;;    ,'     ;;    ,;;\n" +
                        "        : ;;.  .:' ;;' ,:::' ;;:::' ;;    ;;'    ,'    ;;;    ;;;'\n" +
                        "         :`;;  ::  ;;  ;;;' '  .    ;;    '  _,-'     ;;;     `;'\n" +
                        "         : ;' .:'  ;; .::: ,%'`;   ;;;   _,-'       .;;;'     ;'\n" +
                        "        ,' ;; ;;  ;;' :::' ,, .;  ;;  _,' ;      ,;;;'     ,;;'\n" +
                        "       .'~~~~~~~~~._ ,;' ,',' ;;  ',-'   ,'    ,';;       ;;;'   ;;;\n" +
                        "     ,'             `-.,' .'  ;; ,'     ,' ;;;;;;'       ,;;    ;;;\n" +
                        "    .';           .    `.,   ;; ,'      ;              ,;;%    ;;;\n" +
                        "    : ..       _.';     ;   '_,'       .'       ,,,,,,,%;;'    `;;;\n" +
                        "    `.  .     (_.' .  ;'  ,-'          :  ,,,,,;;;;;;;;;'      .;;;\n" +
                        "      `-._        ___,' ,'             :..\"\"\"\"\"`````'        ,;;;;\n" +
                        "          `------'____.'               :                   ..;;;;\n" +
                        "             `---'                     `.               ..;;;;'\n" +
                        "                                        :......:::::::::;;;;'\n" +
                        "                                         :::::::::::::::;'      ,;;;\n" +
                        "                                          ;                   ;;;;'\n" +
                        "                                          ;                 .;;;;\n" +
                        "                                        ,'...:::::.        ;;;'\n" +
                        "                                       .'          `;;;;;;''\n" +
                        "                                       ;\n" +
                        "                         -targon       `----------------------------");
                System.out.println("""
                        Zebras (subgenus Hippotigris) are African
                        equines with distinctive black-and-white striped coats. There are three living species: the Grévy's
                        zebra (Equus grevyi), plains zebra (E. quagga), and the mountain zebra (E. zebra).
                        Zebras share the genus Equus with horses and asses, the three groups being the only living members
                        of the family Equidae. Zebra stripes come in different patterns, unique to each individual.
                        Several theories have been proposed for the function of these stripes, with most evidence supporting
                        them as a deterrent for biting flies. Zebras inhabit eastern and southern Africa and can be found
                        in a variety of habitats such as savannahs, grasslands, woodlands, shrublands, and mountainous areas.
                        Zebras are primarily grazers and can subsist on lower-quality vegetation. They are preyed on mainly
                        by lions and typically flee when threatened but also bite and kick. Zebra species differ in social
                        behaviour, with plains and mountain zebra living in stable harems consisting of an adult male
                        or stallion, several adult females or mares, and their young or foals; while Grévy's zebra live alone
                        or in loosely associated herds. In harem-holding species, adult females mate only with their harem
                        stallion, while male Grévy's zebras establish territories which attract females and the species
                        is promiscuous. Zebras communicate with various vocalisations, body postures and facial expressions.
                        Social grooming strengthens social bonds in plains and mountain zebras.""");
                try {
                    Thread.sleep(120000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }

    //the method below serializes the array list with animals
    public static void save(ArrayList<Animal> array)
    {
        //in a try-catch bock
        try
        {
            FileOutputStream fos = new FileOutputStream("AnimalsList.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(array);
            oos.close();
            fos.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    //the method below deserializes the last saved array list
    public void load(String fileName)
    {
        //in a try-catch block
        try
        {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            try {
            animals = (ArrayList<Animal>) ois.readObject(); }
            catch (ClassCastException ob) {
                System.out.println("error while loading last data");
            }

            ois.close();
            fis.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
        }
    }

    public void menu()
    {
        Zoo.console();  //show choices
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.print("press the number you would like and then hit enter:  ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                //display available animals
                new Zoo().showAnimals();
                Scanner scannerAnimal = new Scanner(System.in);
                System.out.print("enter the number of an animal so you can see different animals in each category:  ");
                int animal = scannerAnimal.nextInt();
                int temp=0;            //for showing if we reached the end of ArrayList and that we did not find that animal
                boolean check = true;  //for not showing th second message inside each for loop
                switch (animal) {
                    /*in each case we check if the classname is that of the animal the user chose and then we print the animal
                      and else if we reached the end of the list or the animal was already found we exit the loop and break*/
                    case 1:
                        for (var animalChoice:animals)
                        {
                            temp++;
                            if ((animalChoice.getClassName()).equals("chimpanzee"))
                            {
                                animalChoice.print();
                                check = false;

                            }
                            else if (temp==animals.size() && check) System.out.println("sorry we have none of this animal");
                        }
                        //this try-catch block is put in order to wait for the user to see the animals and afterwards
                        //it will show the main menu
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        for (var animalChoice:animals)
                        {
                            temp++;
                            if ((animalChoice.getClassName()).equals("dolphin"))
                            {
                                animalChoice.print();
                                check = false;
                            }
                            else if (temp==animals.size() && check) System.out.println("sorry we have none of this animal");
                        }
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 3:
                        for (var animalChoice:animals)
                        {
                            temp++;
                            if ((animalChoice.getClassName()).equals("eagle"))
                            {
                                animalChoice.print();
                                check = false;
                            }
                            else if (temp==animals.size() && check) System.out.println("sorry we have none of this animal");
                        }
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 4:
                        for (var animalChoice:animals)
                        {
                            temp++;
                            if ((animalChoice.getClassName()).equals("kangaroo"))
                            {
                                animalChoice.print();
                                check = false;
                            }
                            else if (temp==animals.size() && check) System.out.println("sorry we have none of this animal");
                        }
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 5:
                        for (var animalChoice:animals)
                        {
                            temp++;
                            if ((animalChoice.getClassName()).equals("lion"))
                            {
                                animalChoice.print();
                                check = false;
                            }
                            else if (temp==animals.size() && check) System.out.println("sorry we have none of this animal");
                        }
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 6:
                        for (var animalChoice:animals)
                        {
                            temp++;
                            if ((animalChoice.getClassName()).equals("panda"))
                            {
                                animalChoice.print();
                                check = false;
                            }
                            else if (temp==animals.size() && check) System.out.println("sorry we have none of this animal");
                        }
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 7:
                        for (var animalChoice:animals)
                        {
                            temp++;
                            if ((animalChoice.getClassName()).equals("penguin"))
                            {
                                animalChoice.print();
                                check = false;
                            }
                            else if (temp==animals.size() && check) System.out.println("sorry we have none of this animal");
                        }
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 8:
                        for (var animalChoice:animals)
                        {
                            temp++;
                            if ((animalChoice.getClassName()).equals("rhinoceros"))
                            {
                                animalChoice.print();
                                check = false;
                            }
                            else if (temp==animals.size() && check) System.out.println("sorry we have none of this animal");
                        }
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 9:
                        for (var animalChoice:animals)
                        {
                            temp++;
                            if ((animalChoice.getClassName()).equals("snake"))
                            {
                                animalChoice.print();
                                check = false;
                            }
                            else if (temp==animals.size() && check) System.out.println("sorry we have none of this animal");
                        }
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 10:
                        for (var animalChoice:animals)
                        {
                            temp++;
                            if ((animalChoice.getClassName()).equals("spider"))
                            {
                                animalChoice.print();
                                check = false;
                            }
                            else if (temp==animals.size() && check) System.out.println("sorry we have none of this animal");
                        }
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 11:
                        for (var animalChoice:animals)
                        {
                            temp++;
                            if ((animalChoice.getClassName()).equals("giraffe"))
                            {
                                animalChoice.print();
                                check = false;
                            }
                            else if (temp==animals.size() && check) System.out.println("sorry we have none of this animal");
                        }
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 12:
                        for (var animalChoice:animals)
                        {
                            temp++;
                            if ((animalChoice.getClassName()).equals("panther"))
                            {
                                animalChoice.print();
                                check = false;
                            }
                            else if (temp==animals.size() && check) System.out.println("sorry we have none of this animal");
                        }
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 13:
                        for (var animalChoice:animals)
                        {
                            temp++;
                            if ((animalChoice.getClassName()).equals("zebra"))
                            {
                                animalChoice.print();
                                check = false;
                            }
                            else if (temp==animals.size() && check) System.out.println("sorry we have none of this animal");
                        }
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    default:
                        System.out.println("invalid input");
                }
                break;
            case 2:
                //insert new animal
                new Zoo().animalChoice();
                break;
            case 3:
                //search animal by name
                System.out.println(new Zoo().searchByName());
                break;
            case 4:
                //search animal by id
                System.out.println(new Zoo().searchByID());
                break;
            case 5:
                //edit animal by id
                new Zoo().editAnimal();
                break;
            case 6:
                //delete animal by id
                new Zoo().deleteByID();
                break;
            case 7:
                Scanner scannerNew = new Scanner(System.in);
                System.out.println("would you like to hear the sound of animals or see its rarity?");
                System.out.print("press '1' for sound and '2' for rarity:  ");
                int choiceNew = scannerNew.nextInt();
                switch (choiceNew) {
                    case 1:
                        //show animals sound
                        Scanner scannerNewNew = new Scanner(System.in);
                        System.out.println("which animal's sound do you want to hear?");
                        new Zoo().showAnimals();
                        System.out.print("press the respective number:  ");
                        int choiceNewNew = scannerNewNew.nextInt();
                        int tempNew=0;  //variable which is used in order to stop iterating through array list
                        //choose from which animal the user want to hear
                        switch (choiceNewNew) {
                            case 1:
                                outer: for (var animalo:animals)
                                {
                                    tempNew++;
                                    if (animalo.getClassName().equals("chimpanzee")) {
                                        animalo.makeSound();
                                        break outer;
                                    } else if (tempNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                break;
                            case 2:
                                outer: for (var animalo:animals)
                                {
                                    tempNew++;
                                    if (animalo.getClassName().equals("dolphin")) {
                                        animalo.makeSound();
                                        break outer;
                                    } else if (tempNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }

                                break;
                            case 3:
                                outer: for (var animalo:animals)
                                {
                                    tempNew++;
                                    if (animalo.getClassName().equals("eagle")) {
                                        animalo.makeSound();
                                        break outer;
                                    } else if (tempNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                break;
                            case 4:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("kangaroo"))
                                    {
                                        tempNew++;
                                        animalo.makeSound();
                                        break outer;
                                    } else if (tempNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            case 5:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("lion"))
                                    {
                                        tempNew++;
                                        animalo.makeSound();
                                        break outer;
                                    } else if (tempNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            case 6:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("panda"))
                                    {
                                        tempNew++;
                                        animalo.makeSound();
                                        break outer;
                                    } else if (tempNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            case 7:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("penguin"))
                                    {
                                        tempNew++;
                                        animalo.makeSound();
                                        break outer;
                                    } else if (tempNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            case 8:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("rhinoceros"))
                                    {
                                        tempNew++;
                                        animalo.makeSound();
                                        break outer;
                                    } else if (tempNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            case 9:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("snake"))
                                    {
                                        tempNew++;
                                        animalo.makeSound();
                                        break outer;
                                    } else if (tempNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            case 10:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("spider"))
                                    {
                                        tempNew++;
                                        animalo.makeSound();
                                        break outer;
                                    } else if (tempNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            case 11:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("giraffe"))
                                    {
                                        tempNew++;
                                        animalo.makeSound();
                                        break outer;
                                    } else if (tempNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            case 12:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("panther"))
                                    {
                                        tempNew++;
                                        animalo.makeSound();
                                        break outer;
                                    } else if (tempNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            case 13:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("zebra"))
                                    {
                                        tempNew++;
                                        animalo.makeSound();
                                        break outer;
                                    } else if (tempNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            default:
                                System.out.println("invalid input");
                                try {
                                    Thread.sleep(5000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            break;
                        }
                        break;
                    case 2:
                        //show animal rarity
                        Scanner scannerThreeNew = new Scanner(System.in);
                        System.out.println("which animal's rarity would you like to see?");
                        new Zoo().showAnimals();
                        System.out.print("press the respective number:  ");
                        int choiceThreeNew = scannerThreeNew.nextInt();
                        int tempNewNew=0;  //variable which is used in order to stop iterating through array list
                        //choose from which animal the user want to see rarity
                        switch (choiceThreeNew) {
                            case 1:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("chimpanzee"))
                                    {
                                        tempNewNew++;
                                        animalo.rarity();
                                        break outer;
                                    } else if (tempNewNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            case 2:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("dolphin"))
                                    {
                                        tempNewNew++;
                                        animalo.rarity();
                                        break outer;
                                    } else if (tempNewNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            case 3:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("eagle"))
                                    {
                                        tempNewNew++;
                                        animalo.rarity();
                                        break outer;
                                    } else if (tempNewNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            case 4:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("kangaroo"))
                                    {
                                        tempNewNew++;
                                        animalo.rarity();
                                        break outer;
                                    } else if (tempNewNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            case 5:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("lion"))
                                    {
                                        tempNewNew++;
                                        animalo.rarity();
                                        break outer;
                                    } else if (tempNewNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            case 6:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("panda"))
                                    {
                                        tempNewNew++;
                                        animalo.rarity();
                                        break outer;
                                    } else if (tempNewNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            case 7:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("penguin"))
                                    {
                                        tempNewNew++;
                                        animalo.rarity();
                                        break outer;
                                    } else if (tempNewNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            case 8:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("rhinoceros"))
                                    {
                                        tempNewNew++;
                                        animalo.rarity();
                                        break outer;
                                    } else if (tempNewNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            case 9:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("snake"))
                                    {
                                        tempNewNew++;
                                        animalo.rarity();
                                        break outer;
                                    } else if (tempNewNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            case 10:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("spider"))
                                    {
                                        tempNewNew++;
                                        animalo.rarity();
                                        break outer;
                                    } else if (tempNewNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            case 11:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("giraffe"))
                                    {
                                        tempNewNew++;
                                        animalo.rarity();
                                        break outer;
                                    } else if (tempNewNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            case 12:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("panther"))
                                    {
                                        tempNewNew++;
                                        animalo.rarity();
                                        break outer;
                                    } else if (tempNewNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            case 13:
                                outer: for (var animalo:animals)
                                    if (animalo.getClassName().equals("zebra"))
                                    {
                                        tempNewNew++;
                                        animalo.rarity();
                                        break outer;
                                    }
                                    else if (tempNewNew == animals.size())
                                    {
                                        System.out.println("we do not have that animal yet");
                                        try {
                                            Thread.sleep(5000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                break;
                            default:
                                System.out.println("invalid input");
                                try {
                                    Thread.sleep(5000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                break;
                        }
                        break;
                    default:
                        System.out.println("invalid input");
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                }
                break;
            case 8:
                //animal information and ascii art of them
                Zoo.animalInformation();
                break;
            case 9:
                //exit
                save(animals);                         //serialize the list of Animals objects before exit
                System.out.println("thank you");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.exit(0);
            case 141:
                //dislpay a landscape if '141' is entered
                System.out.println("");
                System.out.println("-northern lights-");
                System.out.println("");
                System.out.println("  ` : | | | |:  ||  :     `  :  |  |+|: | : : :|   .        `              .\n" +
                        "      ` : | :|  ||  |:  :    `  |  | :| : | : |:   |  .                    :\n" +
                        "         .' ':  ||  |:  |  '       ` || | : | |: : |   .  `           .   :.\n" +
                        "                `'  ||  |  ' |   *    ` : | | :| |*|  :   :               :|\n" +
                        "        *    *       `  |  : :  |  .      ` ' :| | :| . : :         *   :.||\n" +
                        "             .`            | |  |  : .:|       ` | || | : |: |          | ||\n" +
                        "      '          .         + `  |  :  .: .         '| | : :| :    .   |:| ||\n" +
                        "         .                 .    ` *|  || :       `    | | :| | :      |:| |\n" +
                        " .                .          .        || |.: *          | || : :     :|||\n" +
                        "        .            .   . *    .   .  ` |||.  +        + '| |||  .  ||`\n" +
                        "     .             *              .     +:`|!             . ||||  :.||`\n" +
                        " +                      .                ..!|*          . | :`||+ |||`\n" +
                        "     .                         +      : |||`        .| :| | | |.| ||`     .\n" +
                        "       *     +   '               +  :|| |`     :.+. || || | |:`|| `\n" +
                        "                            .      .||` .    ..|| | |: '` `| | |`  +\n" +
                        "  .       +++                      ||        !|!: `       :| |\n" +
                        "              +         .      .    | .      `|||.:      .||    .      .    `\n" +
                        "          '                           `|.   .  `:|||   + ||'     `\n" +
                        "  __    +      *                         `'       `'|.    `:\n" +
                        "\"'  `---\"\"\"----....____,..^---`^``----.,.___          `.    `.  .    ____,.,-\n" +
                        "    ___,--'\"\"`---\"'   ^  ^ ^        ^       \"\"\"'---,..___ __,..---\"\"'\n" +
                        "--\"'                           ^                         ``--..,__ ");
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println();
                break;
            default:
                System.out.println("wrong input");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    @Override
    public void makeSound() {}
    @Override
    public void rarity() {}
}
