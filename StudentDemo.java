// Define the Student class
class Student {
    // Private attributes for encapsulation
    private String name;
    private int id;
    private double gpa;

    // Static variable to keep track of the number of Student objects created
    private static int studentCount = 0;

    // Constructor to initialize name, id, and gpa, and increment studentCount
    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        studentCount++;
    }

    // Method to display the student's information
    public void displayStudentInfo() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", GPA: " + gpa);
    }

    // Static method to display the total number of students
    public static void displayStudentCount() {
        System.out.println("Total students: " + studentCount);
    }
}

// Main class where the program starts
public class StudentDemo {
    public static void main(String[] args) {
        // Create three Student objects with different data
        Student student1 = new Student("Alice", 101, 3.8);
        Student student2 = new Student("Bob", 102, 3.5);
        Student student3 = new Student("Charlie", 103, 3.9);

        // Call displayStudentInfo() for each student
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();

        // Call the static method to display the total student count
        Student.displayStudentCount();
    }
}
