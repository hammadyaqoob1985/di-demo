package guru.springframework.didemo.services;

public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO_GURUS = "Hello gurus!!!";
    @Override
    public String sayGreetings() {
        return HELLO_GURUS;
    }
}
