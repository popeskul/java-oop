package org.example.hw3.games;

public class Cat implements Participant {
    private final String name;
    private final double maxJumpHeight;
    private final double maxRunDistance;

    public Cat(String name, double maxJumpHeight, double maxRunDistance) {
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
        System.out.println("Cat is jumping");
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
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
