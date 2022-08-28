package ua.hillelit.homeworks.service;

import ua.hillelit.homeworks.model.animal.Animal;
import ua.hillelit.homeworks.model.animal.Cat;
import ua.hillelit.homeworks.model.animal.Dog;

public class AnimalCreator {
    public static void main(String[] args) {

        Animal catBars1 = new Cat("Барс1");
        Animal catBars2 = new Cat("Барс2");
        Animal catBars3 = new Cat("Барс3");
        Animal catBars4 = new Cat("Барс4");

        Animal dogShar1 = new Dog("Шар1");
        Animal dogShar2 = new Dog("Шар2");
        Animal dogShar3 = new Dog("Шар3");

        catBars1.run(catBars1, 100);
        catBars1.swim(catBars1, 3);

        dogShar1.run(dogShar1, 222);
        dogShar1.swim(dogShar1, 10);

        System.out.println(Cat.getCounterOfCats());
        System.out.println(Dog.getCounterOfDogs());
        System.out.println(Animal.getCounterOfAnimals());
    }
}
