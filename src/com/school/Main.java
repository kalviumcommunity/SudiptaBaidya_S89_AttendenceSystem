// package com.school;

// public class Main {
//     public static void main(String[] args){
//         System.out.println("Welcome to the School Attendance System Project!");
//         System.out.println("Session 1: Project Setup and Orientation Complete.");
//     }
// }


package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- School Attendance System ---");

    Student[] students = new Student[4];
    students[0] = new Student("Alice Wonderland", "Grade 10");
    students[1] = new Student("Bob the builder", "Grade 9");
    students[2] = new Student("Charlie Chaplin", "Grade 11");
    students[3] = new Student("Dora Explorer", "Grade 8");

        Course[] courses = new Course[3];
        courses[0] = new Course("Intro to programming");
        courses[1] = new Course("Linear Algebra");
        courses[2] = new Course("Physics 101");

        System.out.println("\nRegistered Students: ");
        for(Student student : students) {
            if(student != null) student.displayDetails();
        }

        System.out.println("\nAvailable Courses: ");
        for(Course course : courses) {
            if (course != null) course.displayDetails();
        }

        System.out.println("\nSession 2: Core Domain Modelling Complete");

    // Demonstrate Teachers and Staff
    System.out.println("\n--- Staff and Teachers ---");
    Teacher t1 = new Teacher("Ms. Frizzle", "Physics");
    Staff s1 = new Staff("Mr. Smith", "Administrator");

    t1.displayDetails();
    s1.displayDetails();

    // Demonstrate AttendanceRecord using student's inherited getId()
    AttendanceRecord record = new AttendanceRecord(students[0].getId(), courses[0].getCourseId(), "Present");
    System.out.println("\nSample Attendance Record:");
    record.displayRecord();
    }
}
