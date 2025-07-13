package fee;

import ticket.Ticket;

import java.math.BigDecimal;

public class baseFareStrategy implements FareStrategy{

    private static final BigDecimal SMALL_VEHICLE_RATE = new BigDecimal("1.0");
    private static final BigDecimal MEDIUM_VEHICLE_RATE = new BigDecimal("2.0");


    @Override
    public BigDecimal calculateFare(Ticket ticket, BigDecimal inputFare) {
        BigDecimal fare = inputFare;
        BigDecimal rate;
        switch (ticket.getVehicle().getVehicleSize()) {
            case MEDIUM :
                rate = MEDIUM_VEHICLE_RATE;
                break;
            default:
                rate = SMALL_VEHICLE_RATE;
        }

        fare = fare.add(rate.multiply(ticket.calculateParkingDuration()));
        return fare;
    }
}
