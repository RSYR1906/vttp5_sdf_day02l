package LectureExamples;

public class Computer {

    private String cpu;
    private String model;
    private Integer ram;
    private Integer year;

    public Computer() { // constructor with no arguments
        this.cpu = "2GHz dual core";
        this.model = "Gigabyte 1000";
        this.ram = 8;
        this.year = 2020;
    }

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
        System.out.println(this.model);
        System.out.println(this.cpu);
        System.out.println(this.ram);
        System.out.println(this.year);

    }

    public void start() {
        System.out.println("Computer is powered on");
    }
}