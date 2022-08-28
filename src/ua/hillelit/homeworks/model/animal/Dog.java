package ua.hillelit.homeworks.model.animal;

public class Dog extends Animal{
    public Dog() {
        super();
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(Animal animal, int dis) {
        if(dis < 0) {
            System.out.println("Дистанция не может быть отрицательна");
        }
        if(dis > 500) {
            System.out.println("Собака не может пробежать больше 500 метров");
        }
        else System.out.println("Собака пробежала " + dis + " метров");
    }

    @Override
    public void swim(Animal animal, int dis) {
        if(dis < 0) {
            System.out.println("Дистанция не может быть отрицательна");
        }
        if(dis > 10) {
            System.out.println("Собака не может проплыть больше 10 метров");
        }
        else System.out.println("Собака проплыла " + dis + " метров");
    }
}
