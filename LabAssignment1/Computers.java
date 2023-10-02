package LabAssignment1;
    class Computer implements Cloneable {
        private String computerNumber;
        private String lcdModel;
        private int ramSize;
        private int hddSize;
        private boolean hasGPU;

        // Default constructor
        public Computer() {}

        public Computer(String computerNumber, String lcdModel, int ramSize, int hddSize, boolean hasGPU) {
            this.computerNumber = computerNumber;
            this.lcdModel = lcdModel;
            this.ramSize = ramSize;
            this.hddSize = hddSize;
            this.hasGPU = hasGPU;
        }

        // Getter and Setter methods for all attributes
        public String getComputerNumber() {
            return computerNumber;
        }

        public void setComputerNumber(String computerNumber) {
            this.computerNumber = computerNumber;
        }

        public String getLcdModel() {
            return lcdModel;
        }

        public void setLcdModel(String lcdModel) {
            this.lcdModel = lcdModel;
        }

        public int getRamSize() {
            return ramSize;
        }

        public void setRamSize(int ramSize) {
            this.ramSize = ramSize;
        }

        public int getHddSize() {
            return hddSize;
        }

        public void setHddSize(int hddSize) {
            this.hddSize = hddSize;
        }

        public boolean hasGPU() {
            return hasGPU;
        }

        public void setHasGPU(boolean hasGPU) {
            this.hasGPU = hasGPU;
        }

        // Implement equals() to compare two computer objects based on computerNumber
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Computer computer = (Computer) o;
            return computerNumber.equals(computer.computerNumber);
        }

        // Implement clone() to create a deep copy of the computer object
        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

