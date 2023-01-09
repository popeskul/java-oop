package org.example.hw3.games;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Participant> participants = List.of(
                new Human("Human1", 1.5, 100),
                new Human("Human2", 1.7, 150),
                new Cat("Cat1", 2, 200),
                new Cat("Cat2", 1.5, 100),
                new Robot("Robot1", 1.5, 100),
                new Robot("Robot2", 1.7, 150)
        );

        List<Obstacle> obstacles = List.of(
                new Racetrack("Racetrack1", 200),
                new Wall("Wall1", 1.5),
                new Racetrack("Racetrack2", 150),
                new Wall("Wall2", 1.7)
        );

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle.overcome(participant)) {
                    System.out.println("Participant " + participant.getName() + " passed the obstacle " + obstacle.getName());
                } else {
                    System.out.println("Participant " + participant.getName() + " did not pass the obstacle " + obstacle.getName());
                    break;
                }
            }
        }
    }
}
