public class SchoolManagementSystem {
    public static void main(String[] args) {
        // Students
        Student student1 = new Student("Ali", 101);
        Student student2 = new Student("Ahmed", 102);

        // Teachers
        Teacher teacher1 = new Teacher("Mr. Khan", 201);
        Teacher teacher2 = new Teacher("Ms. Javed", 202);

        // Courses
        Course mathCourse = new Course("Mathematics", teacher1, 2); // Set a maximum of 2 students for the math course
        Course scienceCourse = new Course("Science", teacher2, 2);   // Set a maximum of 2 students for the science course

        // Enroll students in courses
        mathCourse.enrollStudent(student1);
        scienceCourse.enrollStudent(student1);
        scienceCourse.enrollStudent(student2);

        // Display enrolled students in courses
        mathCourse.displayEnrolledStudents();
        scienceCourse.displayEnrolledStudents();
    }
}


