package parkinglot;

import fee.FareCalculator;
import fee.FareStrategy;
import parkingmanager.ParkingManager;
import parkingspot.ParkingSpot;
import ticket.Ticket;
import vehicle.Vehicle;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ParkingLot {

    private final FareCalculator fareCalculator;
    private final ParkingManager parkingManager;

    public ParkingLot(FareCalculator fareCalculator, ParkingManager parkingManager) {
        this.fareCalculator = fareCalculator;
        this.parkingManager = parkingManager;
    }

    public Ticket enterVehicle(Vehicle vehicle) {
        ParkingSpot spot = parkingManager.parkVehicle(vehicle);

        if (spot != null) {
            return new Ticket("dummy ticket ID", vehicle, spot, LocalDateTime.now());
        } else {
            System.out.println("Parking is full");
        }
        return null;
    }

    public void leaveVehicle(Ticket ticket) {
        if (ticket != null && ticket.getExitTime() == null) {
            ticket.setExitTime(LocalDateTime.now());
            parkingManager.unParkVehicle(ticket.getVehicle());

            BigDecimal fare = fareCalculator.calculateFare(ticket);
        }
    }
}
