package ru.geekbrains.cources;

public class Dog extends Animal {

    public Dog(String name) {
        super.name = name;
    }

    public Dog(String name, int maxRun, int maxSwim, int maxJump) {
        super(name, maxRun, maxSwim, maxJump);
    }

    public Dog setMaxRun(int maxRun) {
        this.maxRun = maxRun;
        return this;
    }

    public Dog setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
        return this;
    }

    public Dog setMaxJump(int maxJump) {
        this.maxJump = maxJump;
        return this;
    }
}
