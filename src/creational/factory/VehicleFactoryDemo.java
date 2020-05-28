package creational.factory;

public class VehicleFactoryDemo {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car= vehicleFactory.getVehicle("CAR");
        System.out.println("This is car " + car.injectFuel());

        Vehicle van= vehicleFactory.getVehicle("CAR");
        System.out.println("This is van " + van.injectFuel());
    }
}
