package org.example.hw1;

public class Dog extends Animal {
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    public Dog(String name) {
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
        if (checkDistance(distance, MAX_SWIM_DISTANCE))
            return String.format(RESTRICTION_MESSAGE, getName(), "swim");
        else
            return String.format(INFO_MESSAGE, getName(), "swim", distance);
    }
}
