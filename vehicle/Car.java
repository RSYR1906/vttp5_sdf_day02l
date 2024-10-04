package vehicle;

public class Car extends Vehicle {

    public String carType;

    public Integer numberofPassenger;

    public Car(String model, String make, Integer year, String carType, Integer numberofPassenger) {
        super(model, make, year);
        this.carType = carType;
        this.numberofPassenger = numberofPassenger;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Integer getNumberofPassenger() {
        return numberofPassenger;
    }

    public void setNumberofPassenger(Integer numberofPassenger) {
        this.numberofPassenger = numberofPassenger;
    }

    @Override
    public void start() {

        System.out.println("Car Started");
    }

    @Override
    public void stop() {
        this.setSpeed(0);
        System.out.println("Car stopped");
    }

    @Override
    public void accelerate(Integer increment) {
        this.setSpeed(this.getSpeed() + increment + 10);
    }

    // @Override
    // public void brake(Integer decrement) {
    // this.setSpeed(this.getSpeed() + decrement);
    // }

    @Override
    public void honk() {
        System.out.println("BEEP!");
    }

}
