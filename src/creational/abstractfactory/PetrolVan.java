package creational.abstractfactory;

public class PetrolVan implements Vehicle{
    @Override
    public String injectFuel() {
        return "Inject Petrol for Van";
    }
}
