package ru.geekbrains.cources;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 200, 2);
        Dog dog1 = new Dog("Sharik", 500, 10, 1);

        Dog dog2 = new Dog("Taksa").setMaxRun(400).setMaxSwim(10).setMaxJump(1);
        Dog dog3 = new Dog("Volk").setMaxRun(600).setMaxSwim(12).setMaxJump(1);

        System.out.println(cat1.run(150));
        System.out.println(cat1.run(250));
        System.out.println(cat1.swim(250));

        System.out.println(dog1.run(150));
        System.out.println(dog1.run(250));
        System.out.println(dog1.swim(250));
    }
}
