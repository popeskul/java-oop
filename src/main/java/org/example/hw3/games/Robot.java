package org.example.hw3.games;

public class Robot implements Participant {
    private final String name;
    private final double maxJumpHeight;
    private final double maxRunDistance;

    public Robot(String name, double maxJumpHeight, double maxRunDistance) {
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
        System.out.println("Robot is jumping");
    }

    @Override
    public void run() {
        System.out.println("Robot is running");
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
