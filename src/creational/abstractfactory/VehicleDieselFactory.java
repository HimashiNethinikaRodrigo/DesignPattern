package creational.abstractfactory;

public class VehicleDieselFactory implements VehicleAbstractFactory{
    @Override
    public Vehicle getVehicle(String vehicleType) {
        if("DIESEL_TRUCK".equalsIgnoreCase(vehicleType))
            return new DieselTruck();
        else if("DIESEL_VAN".equalsIgnoreCase(vehicleType))
            return new DieselVan();

        return null;
    }
}
