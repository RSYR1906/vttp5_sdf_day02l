

import LectureExamples.Computer;

public class App {

    public static void main(String[] args) {

        Computer computer = new Computer(); // instantiate computer object
        computer.setCpu("5GHz 8 core");
        computer.setModel("Asus 8000");
        computer.setRam(32);
        computer.setYear(2024);

        computer.start();
        computer.displaySpec();
        computer.shutdown();

        Computer computer2 = new Computer();
        computer2.start();
        computer2.displaySpec();
        computer2.shutdown();

    }
}
