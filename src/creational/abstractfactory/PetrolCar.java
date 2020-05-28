package creational.abstractfactory;

public class PetrolCar implements Vehicle{
    @Override
    public String injectFuel() {
        return "Inject Petrol for Car";
    }
}
