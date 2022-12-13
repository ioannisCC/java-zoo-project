package com.ioannis.unipiZoo;

public class Main{

    public static void main(String[] args) {

        new Zoo().load(".\\.\\.\\.\\.\\.\\.\\AnimalsList.ser");  //deserialize the file with Animal objects
        //create some indicative animals and add each one of them to the 'animals' array list
        Chimpanzee chimp = new Chimpanzee ("alfred", "mammal", 78.0, 7, 8);
        chimp.addAnimal(chimp);
        Lion li = new Lion( "gerald", "mammal", 100.0, 4, "male");
        li.addAnimal(li);
        Dolphin dol = new Dolphin("fin", "mammal", 1000.0, 2, 7);
        dol.addAnimal(dol);
        Eagle eag = new Eagle("crobus", "oviparous", 40.0, 9, 1.93);
        eag.addAnimal(eag);
        Kangaroo kang = new Kangaroo("skippy", "mammal", 67.0, 12, true);
        kang.addAnimal(kang);
        Panda pan = new Panda("lulu", "mammal", 400.0, 5, 9);
        pan.addAnimal(pan);
        Penguin peng = new Penguin("rico", "oviparious", 100.0, 2, "black&white");
        peng.addAnimal(peng);
        Rhinoceros rhino = new Rhinoceros("basalt", "mammal", 3000.0, 20, 0.73);
        rhino.addAnimal(rhino);
        Snake sna = new Snake("asmodeus", "reptile", 40.0, 8, 2.0);
        sna.addAnimal(sna);
        Spider spi = new Spider("ocho", "insect", 0.5, 1, 8);
        spi.addAnimal(spi);

        System.out.println("");
        System.out.println("888888888  ,adPPYba,   ,adPPYba,   \n" +
                "     a8P\" a8\"     \"8a a8\"     \"8a  \n" +
                "  ,d8P'   8b       d8 8b       d8  \n" +
                ",d8\"      \"8a,   ,a8\" \"8a,   ,a8\"  \n" +
                "888888888  `\"YbbdP\"'   `\"YbbdP\"'   \n" +
                "                                   ");
        System.out.println("");
        System.out.println("======================");
        System.out.println("||welcome to our zoo||");
        System.out.println("======================");

        //menu
        boolean next = true;
        while (next) {
            new Zoo().menu();
        }
    }
}
