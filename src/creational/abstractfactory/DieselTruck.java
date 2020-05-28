package creational.abstractfactory;

public class DieselTruck implements Vehicle{
    @Override
    public String injectFuel() {
        return "Inject Diesel for Truck";
    }
}
