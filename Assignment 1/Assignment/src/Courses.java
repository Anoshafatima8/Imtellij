class Course {
    private String courseName;
    private Teacher teacher;
    private Student[] enrolledStudents;
    private int numberOfStudents;

    public Course(String courseName, Teacher teacher, int maxStudents) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.enrolledStudents = new Student[maxStudents];
        this.numberOfStudents = 0;
    }

    public void enrollStudent(Student student) {
        if (numberOfStudents < enrolledStudents.length) {
            enrolledStudents[numberOfStudents] = student;
            numberOfStudents++;
        } else {
            System.out.println("The course is already full. Cannot enroll more students.");
        }
    }

    public void displayEnrolledStudents() {
        System.out.println("Enrolled students in " + courseName + " (Taught by " + teacher.getName() + " - ID: " + teacher.getTeacherId() + "):");
        for (int i = 0; i < numberOfStudents; i++) {
            Student student = enrolledStudents[i];
            System.out.println("Student ID: " + student.getStudentId() + ", Name: " + student.getName());
        }
    }

}
