package parkingLot;

import parkingLot.vehicle.Vehicle;
import parkingLot.vehicle.VehicleType;

public class ParkingSpot {
    private final int id;
    private final VehicleType spotType;
    private Vehicle parkedVehicle;

    public ParkingSpot(int id, VehicleType spotType) {
        this.id = id;
        this.spotType = spotType;
        this.parkedVehicle = null;
    }

    public int getId() {
        return id;
    }

    public VehicleType getSpotType() {
        return spotType;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public boolean isAvailable() {
        return (parkedVehicle == null);
    }

    public synchronized boolean parkVehicle(Vehicle vehicle) {
        if(vehicle==null) throw new IllegalArgumentException("Vehicle can't be null.");
        if (isAvailable() && this.getSpotType().equals(vehicle.getVehicleType())) {
            this.parkedVehicle = vehicle;
            return true;
        }
        return false;
    }

    public synchronized boolean unParkVehicle(Vehicle vehicle) {
        if(vehicle==null) throw new IllegalArgumentException("Vehicle can't be null.");
        if (this.parkedVehicle != null && vehicle.getLicense().equalsIgnoreCase(this.parkedVehicle.getLicense())) {
            this.parkedVehicle = null;
            return true;
        }
        return false;
    }

}
