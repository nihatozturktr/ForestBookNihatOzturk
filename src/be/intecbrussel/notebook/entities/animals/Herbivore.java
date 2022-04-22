package be.intecbrussel.notebook.entities.animals;

import be.intecbrussel.notebook.entities.plants.Plant;

import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Animal {

    Set<Plant> plantDiet = new HashSet<>();

    public Herbivore(String name) {

        super(name, 0, 0, 0);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name,
                weight,
                height,
                length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);
    }

    public void printDiet(){
        plantDiet.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "plantDiet=" + plantDiet +
                "}" + super.toString();
    }


}
