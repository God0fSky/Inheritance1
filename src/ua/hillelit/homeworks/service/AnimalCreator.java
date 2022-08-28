package ua.hillelit.homeworks.service;

import ua.hillelit.homeworks.model.animal.Animal;
import ua.hillelit.homeworks.model.animal.Cat;
import ua.hillelit.homeworks.model.animal.Dog;

public class AnimalCreator {
    public static void main(String[] args) {

        Animal catBars = new Cat("Барс");
        Animal dogShar = new Dog("Шар");
        catBars.run(catBars, 150);
        dogShar.run(dogShar, 366);

    }
}
