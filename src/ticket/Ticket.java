package ticket;

import parkingspot.ParkingSpot;
import vehicle.Vehicle;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Ticket {

    private final String ticketID;
    private final Vehicle vehicle;

    private final ParkingSpot parkingSpot;
    private final LocalDateTime entryTime;

    private LocalDateTime exitTime;

    public Ticket(String ticketID, Vehicle vehicle, ParkingSpot parkingSpot, LocalDateTime entryTime) {
        this.ticketID = ticketID;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
        this.exitTime = null;
    }

    public BigDecimal calculateParkingDuration(){
        return null;
    }

    public String getTicketID() {
        return ticketID;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime time) {
        this.exitTime = time;
    }
}
