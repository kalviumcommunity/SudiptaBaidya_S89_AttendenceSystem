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

## Part 5: Establishing Students, Teaching & Non-Teaching Staff hierarchy
- Created a base class `Person.java` with common attributes (`id`, `name`), a universal auto-ID generator, and a `displayDetails()` method.
- Modified `Student.java` to inherit from `Person`, using `super()` to call the parent constructor and overriding `displayDetails()` to add student-specific info (e.g., grade level).
- Created `Teacher.java` extending `Person`, adding a `subjectTaught` attribute and its own `displayDetails()`.
- Created `Staff.java` extending `Person`, adding a `role` attribute and its own `displayDetails()`.
- Demonstrated creation and display of `Student`, `Teacher`, and `Staff` objects in `Main.java`.
- Updated `AttendanceRecord` creation to use the inherited `getId()` method.
```
