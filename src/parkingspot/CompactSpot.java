package parkingspot;

import vehicle.Vehicle;
import vehicle.VehicleSize;

public class CompactSpot implements ParkingSpot {

    private int spotNumber;
    private Vehicle vehicle; // The Vehicle that is currently occupying this spot


    public CompactSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.vehicle = null;
    }

    @Override
    public boolean isAvailable() {
        return vehicle == null;
    }

    @Override
    public void occupy(Vehicle vehicle) {
        if (isAvailable()) {
            this.vehicle = vehicle;
        } else {
            System.out.println("This spot is already occupied");
        }
    }

    @Override
    public void vacate() {
        this.vehicle = null;
    }

    @Override
    public int getSpotNumber() {
        return spotNumber;
    }

    @Override
    public VehicleSize getSize() {
        return VehicleSize.SMALL;
    }
}
