package parkingLot;

import parkingLot.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot parkingLot;

    private List<ParkingLevel> parkingLevels;

    private ParkingLot() {
        parkingLevels = new ArrayList<>();
    }

    public static ParkingLot getParkingLot() {
        if (parkingLot == null) {
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }

    public void addLevel(int floor) {
        ParkingLevel level = new ParkingLevel(floor);
        parkingLevels.add(level);
    }

    public synchronized boolean parkVehicle(Vehicle vehicle) {
        for (ParkingLevel level : parkingLevels) {
            if (level.parkVehicle(vehicle))
                return true;
        }
        return false;
    }

    public synchronized boolean unParkVehicle(Vehicle vehicle) {
        for (ParkingLevel level : parkingLevels) {
            if (level.unParkVehicle(vehicle))
                return true;
        }
        return false;
    }

    public void displayStatus() {
        System.out.println("\nParking Lot Status: ");
        for (ParkingLevel level : parkingLevels) {
            level.displayStatus();
        }
    }


}
