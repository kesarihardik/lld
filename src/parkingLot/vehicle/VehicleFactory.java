package parkingLot.vehicle;

public class VehicleFactory {
    public static Vehicle createVehicle(VehicleType vehicleType, String license){
        switch(vehicleType){
            case VehicleType.CAR -> {
                return new Car(license);
            }
            case VehicleType.BIKE -> {
                return new Bike(license);
            }
            default ->  throw new IllegalArgumentException("Unknown vehicle type: " + vehicleType);
        }
    }
}
