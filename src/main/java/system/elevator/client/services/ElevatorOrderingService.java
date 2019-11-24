package system.elevator.client.services;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Service;
import system.elevator.client.model.ElevatorOrder;

@Service
public class ElevatorOrderingService {
    public void present() {
        System.out.println("Hello, I'm ready to send you an elevator!");
    }

    public JSONPObject generateOrder() {
        long round = Math.round(Math.random() * 10);
        int start = (int) round;

        round = Math.round(Math.random() * 10);
        int destination = (int) round;

        ElevatorOrder elevatorOrder = new ElevatorOrder(start, destination);
//        return elevatorOrder;

        // JSON Object !
        JSONPObject object = new JSONPObject();
    }
}
