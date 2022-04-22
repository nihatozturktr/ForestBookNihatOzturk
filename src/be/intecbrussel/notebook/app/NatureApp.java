package be.intecbrussel.notebook.app;

import be.intecbrussel.notebook.entities.animals.Carnivore;
import be.intecbrussel.notebook.entities.animals.Herbivore;
import be.intecbrussel.notebook.entities.animals.Omnivore;
import be.intecbrussel.notebook.entities.plants.*;
import be.intecbrussel.notebook.service.ForestNotebook;

import java.util.LinkedHashSet;
import java.util.Set;

public class NatureApp {
    public static void main(String[] args) {
        Set<Plant> plantDiet = new LinkedHashSet<>();
        ForestNotebook notebook = new ForestNotebook();

        Tree pine = new Tree("Pine", 20.3);
        Flower rose = new Flower("Rose", 3.05);
        Flower daisy = new Flower("Daisy", 0.55);
        Weed wheat = new Weed("Clover", 0.15);
        Tree apple = new Tree("Apple", 8);
        Tree pear = new Tree("Pear", 12);
        Bush raspberry = new Bush("Raspberry", 4.1);
        Bush roseHip = new Bush("Rose hip", 2);


        daisy.setSmell(Scent.SWEET);
        rose.setSmell(Scent.MUSKY);
        pine.setLeafType(LeafType.HAND);
        apple.setLeafType(LeafType.ROUND);
        pear.setLeafType(LeafType.HEART);
        roseHip.setFruit("Rose Hips");
        roseHip.setLeafType(LeafType.HAND);
        raspberry.setFruit("Raspberry");
        raspberry.setLeafType(LeafType.HEART);
        wheat.setArea(48);

        Herbivore brown = new Herbivore("Brown", 260, 2, 1.9);
        brown.addPlantToDiet(wheat);
        Herbivore merino = new Herbivore("Merino", 47.4, 1.1, 1.3);
        merino.addPlantToDiet(wheat);
        Herbivore lintGoat = new Herbivore("lint goat", 33.3, 1.1, 1.2);
        lintGoat.addPlantToDiet(pine);
        Herbivore merzifonDonkey = new Herbivore("Merzifon Donkey", 135.1, 2.2, 2.8);


        Carnivore martes = new Carnivore("Martes foina", 10.4, 0.40, 0.20);
        martes.setMaxFoodSize(1);

        Carnivore dog = new Carnivore("Sivas Kangal", 50.1, 1.7, 2);
        dog.setMaxFoodSize(2);

        Carnivore snake = new Carnivore("Python", 200.9, 0.80, 9.9);
        snake.setMaxFoodSize(3);

        Omnivore bear = new Omnivore("Grizzly bear", 200.6, 1.9, 1.50);
        bear.setMaxFoodSize(2);
        bear.addPlantToDiet(pear);


        Omnivore pig = new Omnivore("Pig", 50, 0.50, 1);
        pig.setMaxFoodSize(0.8);
        pig.addPlantToDiet(roseHip);


        Omnivore chicken = new Omnivore("Krooky", 5.3, 0.30, 0.60);
        chicken.setMaxFoodSize(0.7);
        chicken.addPlantToDiet(wheat);

        brown.setPlantDiet(plantDiet);
        merino.setPlantDiet(plantDiet);
        lintGoat.setPlantDiet(plantDiet);
        bear.setPlantDiet(plantDiet);
        pig.setPlantDiet(plantDiet);
        chicken.setPlantDiet(plantDiet);

        notebook.addPlant(pine);
        notebook.addPlant(apple);
        notebook.addPlant(pear);
        notebook.addPlant(rose);
        notebook.addPlant(wheat);
        notebook.addPlant(raspberry);
        notebook.addPlant(roseHip);
        notebook.addPlant(daisy);

        notebook.addAnimal(martes);
        notebook.addAnimal(dog);
        notebook.addAnimal(snake);
        notebook.addAnimal(merino);
        notebook.addAnimal(lintGoat);
        notebook.addAnimal(merzifonDonkey);
        notebook.addAnimal(brown);
        notebook.addAnimal(bear);
        notebook.addAnimal(pig);
        notebook.addAnimal(chicken);

        System.out.println("------------------");
        System.out.println("Index of Notebook");
        System.out.println(" ");
        notebook.printNotebook();
        System.out.println(" ");

        System.out.println("------------------");
        System.out.println("Plants sorted by name");
        System.out.println(" ");
        notebook.sortPlantsByName();
        System.out.println("------------------");
        System.out.println(" ");
        System.out.println("Animals sorted by name");
        System.out.println(" ");
        notebook.sortAnimalsByName();
        System.out.println("------------------");
        System.out.println(" ");

        System.out.println("Animals and Plants sorted by their heights");
        notebook.sortAnimalsByHeight();
        notebook.sortPlantsByHeight();
        System.out.println("------------------");
        System.out.println(" ");

        System.out.println("Total number of plants counted");
        System.out.println(notebook.getPlantCount());
        System.out.println("Total number of animals counted");
        System.out.println(notebook.getAnimalCount());
        System.out.println("------------------");

    }
}
