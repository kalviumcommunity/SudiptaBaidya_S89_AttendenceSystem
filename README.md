# SudiptaBaidya_S89_AttendenceSystem

## Part 3: Constructor Initialization & Auto-ID Generation
- Implemented constructors for `Student` and `Course` classes to initialize objects.
- Added automatic unique ID generation using static variables:
  - `Student` IDs start from 1 and increment automatically.
  - `Course` IDs start from 101 and increment automatically.
- Removed `setDetails` methods from both classes.
- Updated `Course` class to use `int` for `courseId` and display it prefixed with "C".
- Updated `Main.java` to create instances using new constructors and demonstrate auto-ID generation.

### How to Run
1. Navigate to the project root directory.
2. Compile: `javac src/com/school/*.java`
3. Run: `java -cp src com.school.Main`

### Output Includes:
- Automatically generated Student and Course IDs.
- Display of registered students and available courses with their details.

### Output Example:
```
--- School Attendance System ---

Registered Students:
Student ID: 1, Name: Alice Wonderland
Student ID: 2, Name: Bob the builder
Student ID: 3, Name: Charlie Chaplin
Student ID: 4, Name: Dora Explorer

Available Courses:
Course ID: C101, Name: Intro to programming
Course ID: C102, Name: Linear Algebra
Course ID: C103, Name: Physics 101

Session 2: Core Domain Modelling Complete
