package system.elevator.client.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String indexWithParam(@RequestParam(name = "q", required = false) String param) {
        return "Congrats, genius! This is your param: " + param;
    }
}
