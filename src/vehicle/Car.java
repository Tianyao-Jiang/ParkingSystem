package vehicle;

public class Car implements Vehicle {

    private final String plateNumber;

    public Car (String plateNumber){
        this.plateNumber = plateNumber;
    }

    @Override
    public String getPlate() {
        return this.plateNumber;
    }

    @Override
    public VehicleSize getVehicleSize() {
        return VehicleSize.MEDIUM;
    }
}
