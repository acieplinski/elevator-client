package system.elevator.client.model;

import java.time.Instant;

public class ElevatorOrder {
    private int startFloor;
    private int finalFloor;
    private Instant orderTime;

    public ElevatorOrder(int start, int destination) {
        startFloor = start;
        finalFloor = destination;
        orderTime = Instant.now();
    }
}
