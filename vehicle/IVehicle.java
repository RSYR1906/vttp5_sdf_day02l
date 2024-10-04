package vehicle;

public interface IVehicle {                 //only method signatures in the interface
    public void start();

    public void stop();

    public void accelerate(Integer increment);

    public void brake(Integer decrement);

    public void honk();

}
