package ru.geekbrains.cources;

public class Animal {
    String name;
    int maxRun;
    int maxSwim;
    int maxJump;

    Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int maxRun, int maxSwim, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
    }

    public String getName() {
        return name;
    }

    public Animal setMaxRun(int maxRun) {
        this.maxRun = maxRun;
        return this;
    }

    public Animal setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
        return this;
    }

    public Animal setMaxJump(int maxJump) {
        this.maxJump = maxJump;
        return this;
    }

    public boolean run(int run) {
        return maxRun >= run;
    }

    public boolean swim(int swim) throws RuntimeException {
        return maxSwim >= swim;
    }

    public boolean jump(int jump) {
        return maxJump >= jump;
    }
}
