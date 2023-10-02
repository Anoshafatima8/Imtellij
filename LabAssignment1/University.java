package LabAssignment1;

// Class University
class University {
    private Lab[] labs;

    // Default constructor
    public University() {}

    // Add a lab to the university
    public void addLab(Lab lab) {
        // Check if labs array is null
        if (labs == null) {
            labs = new Lab[1];
            labs[0] = lab;
        } else {
            // Extend the labs array and add the new lab
            labs = Arrays.copyOf(labs, labs.length + 1);
            labs[labs.length - 1] = lab;
        }
    }

    // Remove a lab from the university
    public void removeLab(String labID) {
        if (labs != null) {
            for (int i = 0; i < labs.length; i++) {
                if (labs[i] != null && labs[i].getLabID().equals(labID)) {
                    labs[i] = null;
                    break;
                }
            }
        }
    }

    }
}


