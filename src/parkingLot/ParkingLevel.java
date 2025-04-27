package parkingLot;

import parkingLot.vehicle.Vehicle;
import parkingLot.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingLevel {
    private int floor;
    private List<ParkingSpot> parkingSpots;

    public ParkingLevel(int floor) {

        this.floor = floor;

        List<ParkingSpot> spots = new ArrayList<>();

        int totalSpots = 100;

        for (int i = 0; i < 60; i++) {
            spots.add(new ParkingSpot(i, VehicleType.BIKE));
        }
        for (int i = 61; i < 100; i++) {
            spots.add(new ParkingSpot(i, VehicleType.CAR));
        }
        this.parkingSpots = spots;
    }

    public boolean isAvailable() {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isAvailable()) return true;
        }
        return false;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.parkVehicle(vehicle))
                return true;
        }
        return false;
    }

    public boolean unParkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.unParkVehicle(vehicle))
                return true;
        }
        return false;
    }

    public void displayStatus() {
        System.out.println("\n Level " + floor + " Status");
        for (ParkingSpot spot : parkingSpots) {
            System.out.println("Spot : " + spot.getId() + ", Spot Type: " + spot.getSpotType() + ", Occupied: " + !spot.isAvailable());
        }
    }
}
