package org.example.hw3.games;

public class Wall implements Obstacle {
    private final double height;
    private final String name;

    public Wall(String name, double height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.jump();
        return participant.getMaxJumpHeight() >= height;
    }
}
