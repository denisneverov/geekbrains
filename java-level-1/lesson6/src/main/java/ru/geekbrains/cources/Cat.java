package ru.geekbrains.cources;

public class Cat extends Animal {
    public Cat(String name, int maxRun, int maxJump) {
        super(name, maxRun, 0, maxJump);
    }

    @Override
    public boolean swim(int swim) throws RuntimeException {
        throw new RuntimeException("Cat hate swim");
    }
}
