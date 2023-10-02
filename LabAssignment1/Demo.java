package LabAssignment1;

public class Demo {
    public static void main(String[] args) {
        // Create a University object
        University university = new University();

        // Create an Employee object for lab attendant
        Employee labAttendant = new Employee("LA001", "John Doe");

        // Create a Lab object
        Lab lab1 = new Lab("Lab1", 20, LabStatus.OPERATIONAL, labAttendant);

        // Create Computer objects
        Computer computer1 = new Computer("C001", "LCD Model 1", 8, 500, true);
        Computer computer2 = new Computer("C002", "LCD Model 2", 16, 1000, false);



    }
}