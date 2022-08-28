package ua.hillelit.homeworks.model.animal;

public class Cat extends Animal{

    private static int counterOfCats = 0;
    public Cat() {
        super();
        counterOfCats++;
    }

    public Cat(String name) {
        super(name);
        counterOfCats++;
    }

    @Override
    public void run(Animal cat, int dis) {
        if(dis < 0) {
            System.out.println("Дистанция не может быть отрицательна");
        } else {
            if (dis > 200) {
                System.out.println("Кот не может пробежать больше 200 метров");
            } else System.out.println("Кот " + cat.getName() + " пробежал "
                    + dis + " метров");
        }
    }

    @Override
    public void swim(Animal cat, int dis) {
        System.out.println("Коты не умеют плавать");
    }

    public static int getCounterOfCats() {
        return counterOfCats;
    }

    public static void setCounterOfCats(int counterOfCats) {
        Cat.counterOfCats = counterOfCats;
    }
}
