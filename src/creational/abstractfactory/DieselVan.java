package creational.abstractfactory;

public class DieselVan implements Vehicle {
    @Override
    public String injectFuel() {
        return "Inject Diesel for van";
    }
}
