package org.example.hw3.games;

public class Racetrack implements Obstacle {
    private final double length;
    private final String name;

    public Racetrack(String name, double length) {
        this.name = name;
        this.length = length;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.run();
        return participant.getMaxRunDistance() >= length;
    }
}
