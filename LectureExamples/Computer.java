package LectureExamples;

public class Computer {

    private String cpu;
    private String model;
    private Integer ram;
    private Integer year;

    public Computer() {
    } // no arguments constructor

    public Computer(String cpu, String model, Integer ram, Integer year) { // constructor with paramters and arguments
        this.cpu = cpu;
        this.model = model;
        this.ram = ram;
        this.year = year;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void shutdown() {
        System.out.println("Shutting down computer");
    }

    public void displaySpec() {
        System.out.println("Displaying specs:");
    }

    public void start() {
        System.out.println("Computer is powered on");
    }
}