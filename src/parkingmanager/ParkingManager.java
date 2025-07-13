package parkingmanager;

import parkingspot.ParkingSpot;
import vehicle.Vehicle;
import vehicle.VehicleSize;

import java.util.List;
import java.util.Map;

public class ParkingManager {

    private final Map<Vehicle, ParkingSpot> vehicleParkingSpotMap;
    private final Map<VehicleSize, List<ParkingSpot>> availableSpots;


    public ParkingManager(Map<Vehicle, ParkingSpot> vehicleParkingSpotMap, Map<VehicleSize, List<ParkingSpot>> availableSpots) {
        this.vehicleParkingSpotMap = vehicleParkingSpotMap;
        this.availableSpots = availableSpots;
    }

    public ParkingSpot findSpotForVehicle (Vehicle vehicle) {
        VehicleSize vehicleSize = vehicle.getVehicleSize();

        for (VehicleSize size : VehicleSize.values()) {
            if (size.ordinal() >= vehicleSize.ordinal()) {
                List<ParkingSpot> spots = availableSpots.get(size);

                for (ParkingSpot spot : spots) {
                    if (spot.isAvailable()) {
                        return spot;
                    }
                }
            }
        }
        return null;
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = findSpotForVehicle(vehicle);

        if (spot != null) {
            spot.occupy(vehicle);

            vehicleParkingSpotMap.put(vehicle, spot);
            availableSpots.get(vehicle.getVehicleSize()).remove(spot);

            return spot;
        }

        return null;
    }

    public void unParkVehicle(Vehicle vehicle) {
        ParkingSpot spot = vehicleParkingSpotMap.remove(vehicle);

        if (spot != null) {
            spot.vacate();
            availableSpots.get(spot.getSize()).add(spot);
        }
    }
}