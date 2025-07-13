package vehicle;

public interface Vehicle {

    // Interfaces are meant to define behavior (methods), not state.
    // Since interfaces don’t have instances, they can’t have instance variables.
    // Fields are only there to provide shared constants.

    String getPlate();
    VehicleSize getVehicleSize();
}
