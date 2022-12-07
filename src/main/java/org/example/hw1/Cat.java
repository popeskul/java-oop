package org.example.hw1;

public class Cat extends Animal {
    private static final int MAX_RUN_DISTANCE = 200;

    public Cat(String name) {
        super(name);
    }

    @Override
    public String run(int distance) {
        if (checkDistance(distance, MAX_RUN_DISTANCE))
            return String.format(RESTRICTION_MESSAGE, getName(), "run");
        else
            return getName() + " run " + distance + " m";
    }

    @Override
    public String swim(int distance) {
        return String.format(RESTRICTION_MESSAGE, getName(), "swim");
    }
}
