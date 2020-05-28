package creational.abstractfactory;

public class VehicleAbstractFactoryDemo {
    public static void main(String[] args) {

        VehicleAbstractFactoryGenerator vehicleAbstractFactoryGenerator = new VehicleAbstractFactoryGenerator();

        VehicleAbstractFactory diesel_factory = vehicleAbstractFactoryGenerator.getFactory("DIESEL_FACTORY");
        System.out.println("From Diesel Factory: "+ diesel_factory.getVehicle("DIESEL_TRUCK").injectFuel());
        System.out.println("From Diesel Factory: "+ diesel_factory.getVehicle("DIESEL_VAN").injectFuel());

        VehicleAbstractFactory petrol_factory = vehicleAbstractFactoryGenerator.getFactory("PETROL_FACTORY");
        System.out.println("From Petrol Factory: "+ petrol_factory.getVehicle("PETROL_CAR").injectFuel());
        System.out.println("From Petrol Factory: "+ petrol_factory.getVehicle("PETROL_VAN").injectFuel());

    }
}
