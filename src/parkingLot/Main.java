package parkingLot;

import parkingLot.vehicle.Vehicle;
import parkingLot.vehicle.VehicleFactory;
import parkingLot.vehicle.VehicleType;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getParkingLot();

        parkingLot.addLevel(1);
        parkingLot.addLevel(2);

        Vehicle car = VehicleFactory.createVehicle(VehicleType.CAR, "123");
        Vehicle car2 = VehicleFactory.createVehicle(VehicleType.CAR, "234");

        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(car2);

        parkingLot.displayStatus();

        parkingLot.unParkVehicle(car2);

        parkingLot.displayStatus();

    }
}
