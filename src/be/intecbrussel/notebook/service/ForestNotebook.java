package be.intecbrussel.notebook.service;

import be.intecbrussel.notebook.entities.animals.Animal;
import be.intecbrussel.notebook.entities.animals.Carnivore;
import be.intecbrussel.notebook.entities.animals.Herbivore;
import be.intecbrussel.notebook.entities.animals.Omnivore;
import be.intecbrussel.notebook.entities.plants.Plant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ForestNotebook {private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;

    private int plantCount=0;
    private int animalCount=0;

    private List<Animal> animals;
    private List<Plant> plants;

    public ForestNotebook() {
        carnivores = new ArrayList<>();
        omnivores = new ArrayList<>();
        herbivores = new ArrayList<>();
        animals = new ArrayList<>();
        plants = new ArrayList<>();
    }
    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void addAnimal(Animal animal) {

        animals.add(animal);
        animalCount++;
    }


    public void addPlant(Plant plant) {
        plants.add(plant);
        plantCount++;
    }

    public void printNotebook() {
        animals.forEach(System.out::println);
        plants.forEach(System.out::println);
    }

    public void sortAnimalsByName(){
        animals.stream().
                sorted(Comparator.comparing(Animal::getName)).
                forEach(System.out::println);
    }

    public void sortPlantsByName(){
        plants.stream().
                sorted(Comparator.comparing(Plant::getName)).
                forEach(System.out::println);
    }

    public void sortAnimalsByHeight(){
        animals.sort(Comparator.comparing(Animal::getHeight));
    }

    public void sortPlantsByHeight(){
        plants.sort(Comparator.comparing(Plant::getHeight));
    }
}
