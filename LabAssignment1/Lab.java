package LabAssignment1;


// Class Lab
class Lab {
    private String labID;
    private Computer[] computers;
    private LabStatus status;
    private Employee labAttendant;

    public Lab() {}

    // Parameterized constructor
    public Lab(String labID, int capacity, LabStatus status, Employee labAttendant) {
        this.labID = labID;
        this.computers = new Computer[capacity];
        this.status = status;
        this.labAttendant = labAttendant;
    }

    // Add a computer to the lab
    public void addComputer(Computer computer) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] == null) {
                computers[i] = computer;
                break;
            }
        }
    }

    // Remove a computer from the lab
    public void removeComputer(String computerNumber) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] != null && computers[i].getComputerNumber().equals(computerNumber)) {
                computers[i] = null;
                break;
            }
        }
    }

    // Fetch a computer from the lab based on computerNumber
    public Computer getComputer(String computerNumber) {
        for (Computer computer : computers) {
            if (computer != null && computer.getComputerNumber().equals(computerNumber)) {
                return computer;
            }
        }
        return null;
    }

    // Change lab status
    public void changeLabStatus(LabStatus status) {
        this.status = status;
    }

    // Set lab attendant details
    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }

    // Get lab attendant details
    public Employee getLabAttendant() {
        return labAttendant;
    }
}



