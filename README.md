# SudiptaBaidya_S89_AttendenceSystem
## Part 4: Data Encapsulation & Attendance Recording Validation
- Applied encapsulation to `Student` and `Course` classes by making fields `private` and adding public `getters`.
- Introduced a new `AttendanceRecord` class with `private` fields, a constructor, and `getters` to store attendance data.
- Implemented basic validation in the `AttendanceRecord` constructor for the attendance status (allowing only "Present" or "Absent" - case-insensitive).
- Used an `ArrayList` in `Main.java` to store and display `AttendanceRecord` objects.
- Demonstrated retrieving IDs using getters (e.g., `student1.getStudentId()`) when creating records.
- Tested validation with invalid status ("Late") which shows warning and sets status to "Invalid".

## Session 2: Core Domain Modelling
- Defined `Student` class with `studentId`, `name`, `setDetails()`, and `displayDetails()` method.
- Defined `Course` class with `courseId`, `courseName`, `setDetails()`, and `displayDetails()` method.
- Utilized arrays of objects in `Main.java` to manage and display multiple students and courses.
- Introduced basic usage of `this` keyword.

### How to Run
1. Navigate to the project root directory.
2. Compile: `javac src/com/school/Student.java src/com/school/Course.java src/com/school/Main.java` (or `javac src/com/school/*.java`)
3. Run: `java -cp src com.school.Main`

### Output Includes:
- Student and course details
- Warning message for invalid attendance status
- All attendance records with validation results
- Registered students and their details
- Available courses and their details

### Output Example:
```
--- School Attendance System ---

Registered Students:
Student ID: 1 Name: Alice Wonderland
Student ID: 2 Name: Bob the builder
Student ID: 3 Name: Charlie Chaplin
Student ID: 4 Name: Dora Explorer

Available Courses:
Course ID: C101 Name: Intro to programming
Course ID: C102 Name: Linear Algebra
Course ID: C103 Name: Physics 101

Session 2: Core Domain Modelling Complete
