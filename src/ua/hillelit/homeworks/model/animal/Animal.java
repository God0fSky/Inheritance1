package ua.hillelit.homeworks.model.animal;

public class Animal {
    private String name;
    private static int counterOfAnimals = 0;

    public void run(Animal animal, int dis) {}
    public void swim(Animal animal, int dis) {}

    public Animal () {
        name = null;
        counterOfAnimals++;
    }

    public Animal (String name) {
        this.name = name;
        counterOfAnimals++;
    }

    public String getName() {
        return name;
    }

    public static int getCounterOfAnimals() {
        return counterOfAnimals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setCounterOfAnimals(int counter) {
        Animal.counterOfAnimals = counter;
    }
}
