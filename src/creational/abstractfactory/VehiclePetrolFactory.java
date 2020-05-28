package creational.abstractfactory;

public class VehiclePetrolFactory implements VehicleAbstractFactory {
    @Override
    public Vehicle getVehicle(String vehicleType) {
        if("PETROL_CAR".equalsIgnoreCase(vehicleType))
            return new PetrolCar();
        else if("PETROL_VAN".equalsIgnoreCase(vehicleType))
            return new PetrolVan();

        return null;
    }
}
