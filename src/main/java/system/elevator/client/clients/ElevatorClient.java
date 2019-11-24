package system.elevator.client.clients;

import org.springframework.stereotype.Component;
import system.elevator.client.services.ElevatorOrderingService;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@Component
public class ElevatorClient {

    private final ElevatorOrderingService service;

    public ElevatorClient(ElevatorOrderingService theService) {
        service = theService;
        service.present();

        for (int i = 0; i < 10; i++) {
            try {
                fire();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void fire() throws IOException {
        URL url = new URL("http://www.acme.com");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setDoOutput(true);

        System.out.println("Fire! Http code is " + con.getResponseCode());

        DataOutputStream out = new DataOutputStream(con.getOutputStream());

        out.flush();
        out.close();
    }
}
