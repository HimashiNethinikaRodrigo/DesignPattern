package creational.factory;

public class VehicleFactory {
    //use getVehicle method to get object of different vehicles wanted
    public Vehicle getVehicle(String vehicleType){
        if("CAR".equalsIgnoreCase(vehicleType))
            return new Car();
        else if("VAN".equalsIgnoreCase(vehicleType))
            return new Van();

        return null;
    }
}
