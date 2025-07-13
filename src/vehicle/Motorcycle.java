package vehicle;

public class Motorcycle implements Vehicle {

    private final String plateNumber;

    public Motorcycle(String plateNumber){
        this.plateNumber = plateNumber;
    }
    @Override
    public String getPlate() {
        return this.plateNumber;
    }

    @Override
    public VehicleSize getVehicleSize() {
        return VehicleSize.SMALL;
    }
}
