
import java.util.ArrayList;
import java.util.Arrays;

import LectureExamples.Computer;
import LectureExamples.Desktop;
import LectureExamples.Laptop;

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

        //Laptop laptop01 = new Laptop();

        Desktop desktop01 = new Desktop("4GHz 8 core", "Sony", 8, 2020, "Ubuntu", 10, true);
        desktop01.displaySpec();

        ArrayList<Computer> machines = new ArrayList<>();
        machines.add(desktop01);
        machines.add(computer);
        machines.add(computer2);

        // for (Computer machine : machines) {
        // System.out.println(machine);
        // }

        for (int i = 0; i < machines.size(); i++) {
            System.out.print(machines.get(i));
        }
    }
}
