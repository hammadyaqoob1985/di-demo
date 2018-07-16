package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("getterGreetingService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreetings() {
        return greetingService.sayGreetings();
    }
}


