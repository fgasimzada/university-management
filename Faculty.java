import java.util.ArrayList;

public class Faculty {
    private String name;
    private String department;
    private double salary;
    private ArrayList<Course> courses; // List of courses taught

    // Constructor
    public Faculty(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.courses = new ArrayList<>();
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
    
    public ArrayList<Course> getCourses() {
        return courses;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to add a course
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Method to remove a course
    public void removeCourse(Course course) {
        courses.remove(course);
    }

    // Display faculty information along with courses taught
    public void displayInfo() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
        System.out.println("Courses taught: " + courses);
    }

    // Main method to test the Faculty class
    public static void main(String[] args) {
        Faculty faculty1 = new Faculty("Dr. Noam Chomsky", "Linguistics", 500000);
        
        // Create some Course objects (see Course class below)
        Course course1 = new Course("Linguistics 101", 101);
        Course course2 = new Course("Advanced Syntax", 202);
        
        // Add courses to the faculty member
        faculty1.addCourse(course1);
        faculty1.addCourse(course2);
        
        // Display faculty information including courses taught
        faculty1.displayInfo();
    }
}