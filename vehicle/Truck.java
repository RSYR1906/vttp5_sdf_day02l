package vehicle;

public class Truck extends Vehicle {

    private double cargoCapacity;

    public Truck(String model, String make, Integer year, double cargoCapacity) {
        super(model, make, year);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void start() {

        System.out.println("Truck Started");
    }

    @Override
    public void stop() {
        this.setSpeed(0);
        System.out.println("Truck stopped");
    }

    @Override
    public void accelerate(Integer increment) {
        this.setSpeed(this.getSpeed() + increment + 2);
    }

    @Override
    public void brake(Integer decrement) {
        this.setSpeed(this.getSpeed() + decrement - 5);
    }

    @Override
    public void honk() {
        System.out.println("BOOP!");
    }

}
