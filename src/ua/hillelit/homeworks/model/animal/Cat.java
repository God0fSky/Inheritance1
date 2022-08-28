package ua.hillelit.homeworks.model.animal;

public class Cat extends Animal{
    public Cat() {
        super();
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(Animal cat, int dis) {
        if(dis < 0) {
            System.out.println("Дистанция не может быть отрицательна");
        }
        if(dis > 200) {
            System.out.println("Кот не может пробежать больше 200 метров");
        }
        else System.out.println("Кот " + cat.getName() +" run "
                + dis + " метров");
    }

    @Override
    public void swim(Animal cat, int dis) {
        System.out.println("Коты не умеют плавать");
    }
}
