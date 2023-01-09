package org.example.hw3.games;

public class Human implements Participant {
    private final String name;
    private final double maxJumpHeight;
    private final double maxRunDistance;

    public Human(String name, double maxJumpHeight, double maxRunDistance) {
        this.name = name;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void jump() {
        System.out.println("Human is jumping");
    }

    @Override
    public void run() {
        System.out.println("Human is running");
    }

    @Override
    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }

    @Override
    public double getMaxRunDistance() {
        return maxRunDistance;
    }
}
