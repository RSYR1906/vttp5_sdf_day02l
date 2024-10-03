package LectureExamples;

public class Laptop extends Computer {
    
    private String operatingSystem;

    private Integer weight;

    private String battery;

    private String screenSize;

    
    public Laptop() {
    }

    public Laptop(String cpu, String model, Integer ram, Integer year) {
        super(cpu, model, ram, year);                                       //refer to attributes from parent class and child inherit
    }

    public Laptop(String cpu, String model, Integer ram, Integer year, String operatingSystem, Integer weight,
            String battery, String screenSize) {
        super(cpu, model, ram, year);
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.battery = battery;
        this.screenSize = screenSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public void shutdown() {
        System.out.println("Shutting down computer");
    }
    @Override
    public void displaySpec() {
        System.out.println("Displaying specs:");
        System.out.println(this.getModel());
        System.out.println(this.getCpu());
        System.out.println(this.getRam());
        System.out.println(this.getYear());

    }
    
    @Override
    public void start() {
        System.out.println("Computer is powered on");
    }

}
