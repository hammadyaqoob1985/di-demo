package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceImpl;

public class SetterInjectedController implements GreetingService {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public String sayGreetings() {
        return greetingService.sayGreetings();
    }
}


