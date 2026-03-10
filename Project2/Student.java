package Project2;

public class Student {

    private String studentName;
    private String studentId;
    private String faculty;
    private String major;

    public Student() {}

    public Student(String studentName, String studentId, String faculty, String major) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.faculty = faculty;
        this.major = major;
    }

    public String getStudentName() {
        return studentName; 
    }

    public void setStudentName(String studentName) {
        try {
            int x = 1 / 0;
            System.out.println("From class Student = setStudentName");
            this.studentName = studentName;
        } catch (Exception e) {
            System.out.println("Error setting student name: " + e.getMessage());
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        try {
            int x = 1 / 0;
            System.out.println("From class Student = setStudentId");
            this.studentId = studentId;
        } catch (Exception e) {
            System.out.println("Error setting student ID: " + e.getMessage());
        }
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        try {
            int x = 1 / 0;
            System.out.println("From class Student = setFaculty");
            this.faculty = faculty;
        } catch (Exception e) {
            System.out.println("Error setting faculty: " + e.getMessage());
        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        try {
            int x = 1 / 0;
            System.out.println("From class Student = setMajor");
            this.major = major;
        } catch (Exception e) {
            System.out.println("Error setting major: " + e.getMessage());
        }
    } 

    public void enroll() {
        try {
            int x = 1 / 0;
            System.out.println("From class Student = enroll");
        } catch (Exception e) {
            System.out.println("Error enrolling student: " + e.getMessage());
        }
    }
}
