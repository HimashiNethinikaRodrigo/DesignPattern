package creational.abstractfactory;

public class VehicleAbstractFactoryGenerator {
    public VehicleAbstractFactory getFactory (String factoryType) {
        if("DIESEL_FACTORY".equalsIgnoreCase(factoryType))
            return new VehicleDieselFactory();
        else if("PETROL_FACTORY".equalsIgnoreCase(factoryType))
            return new VehiclePetrolFactory();

        return null;
    }
}
