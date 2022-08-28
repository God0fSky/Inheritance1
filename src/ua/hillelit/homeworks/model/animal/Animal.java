package ua.hillelit.homeworks.model.animal;

public class Animal {
    private String name;
    public void run(Animal animal, int dis) {}
    public void swim(Animal animal, int dis) {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal () {
        name = null;
    }

    public Animal (String name) {
        this.name = name;
    }
}
