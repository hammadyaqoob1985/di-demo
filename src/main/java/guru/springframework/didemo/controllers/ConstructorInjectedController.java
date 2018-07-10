package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreetings() {
        return greetingService.sayGreetings();
    }
}
