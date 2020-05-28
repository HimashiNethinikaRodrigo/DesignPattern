package creational.factory;

public class Car implements Vehicle{
    @Override
    public String injectFuel() {
        return "Inject Petrol";
    }
}
