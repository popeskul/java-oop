package org.example.hw1;

public abstract class Animal implements Creature {
    protected static final String RESTRICTION_MESSAGE = "%s can't %s that far";
    protected static final String INFO_MESSAGE = "%s can %s %d m";
    private static int instanceCounter = 0;

    private String name;

    {
        instanceCounter++;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int getInstanceCounter() {
        return instanceCounter;
    }

    protected boolean checkDistance(int distance, int maxDistance) {
        return distance <= maxDistance;
    }
}
