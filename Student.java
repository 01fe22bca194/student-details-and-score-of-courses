
public class Student extends StudentCourses {
    String name;
    String department;

    public void displayName() {
        System.out.println("--------------------------------");
        System.out.println("Student Name:" + name);
        System.out.println("Student department:" + department);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "abc";
        s.department = "BCA";
        s.displayName();
        System.out.println("The courses are:");
        StudentCourses studentCourses = new StudentCourses();
        studentCourses.displayStudentMarks();

    }
}