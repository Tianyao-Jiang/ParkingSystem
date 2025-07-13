package ticket;

import parkingspot.ParkingSpot;
import vehicle.Vehicle;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {

    private final String ticketID;
    private final Vehicle vehicle;

    private final ParkingSpot parkingSpot;
    private final LocalDateTime entryTime;

    private final LocalDateTime exitTime;

    public Ticket(String ticketID, Vehicle vehicle, ParkingSpot parkingSpot, LocalDateTime entryTime, LocalDateTime exitTime) {
        this.ticketID = ticketID;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
        this.exitTime = null;
    }

    public BigDecimal calculateParkingDuration(){

    }

}
