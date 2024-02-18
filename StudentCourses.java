public class StudentCourses {

    private String[] courseCodes = { "C#", "ST", "ML", "DEVOPS", "MP" };
    private int[] marks = { 85, 92, 22, 88, 39 };

    public void displayStudentMarks() {

        for (int i = 0; i < marks.length; i++) {
            System.out.print("[" + courseCodes[i] + "] ");
        }
        System.out.println("\n" + "--------------------------------");

        // System.out.println("");
        System.out.println("THE COURSES WHERE THE MARKS OBTAINED ARE LESS THAN 40:");
        System.out.println("Course Codes \t Marks Obtained");
        for (int i = 0; i < courseCodes.length; i++) {
            if (marks[i] < 40) {
                System.out.println(courseCodes[i] + "\t\t\t" + marks[i]);
            }
        }
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