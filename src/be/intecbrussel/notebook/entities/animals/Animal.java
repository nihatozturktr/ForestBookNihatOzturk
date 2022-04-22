package be.intecbrussel.notebook.entities.animals;

public class Animal {



    protected String name;
    protected double weight;
    protected double height;
    protected double length;

    public Animal(String name) {
        this(name, 0, 0, 0);

    }

    public Animal(String name, double weight, double height, double length) {
        this.name = name;
        this.weight=weight;
        this.height=height;
        this.length=length;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                '}';
    }
}
