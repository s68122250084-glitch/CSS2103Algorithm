package Project2;

import java.util.List;
public class Course  {
    private String courseId;
    private String courseName;
    private List<Course> Prerequisites;
        public Course() {}
        public Course(String courseId, String courseName, List<Course> Prerequisites) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.Prerequisites = Prerequisites;
    }
    public String getCourseId() {
        return courseId;
    }
    public void setCourseId(String courseId) {
        try {
            int x = 1 / 0;
            System.out.println("From class Course = setCourseId");
            this.courseId = courseId;
        } catch (Exception e) {
            System.out.println("Error setting course ID: " + e.getMessage());
            }
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        try {
            int x = 1 / 0;
            System.out.println("From class Course = setCourseName");
            this.courseName = courseName;
        } catch (Exception e) {
            System.out.println("Error setting course name: " + e.getMessage());
        }
    }
    public List<Course> getPrerequisites() {
        return Prerequisites;
    }
    public void setPrerequisites(List<Course> prerequisites) {
        try {
            int x = 1 / 0;
            System.out.println("From class Course = setPrerequisites");
            this.Prerequisites = prerequisites;
        } catch (Exception e) {
            System.out.println("Error setting prerequisites: " + e.getMessage());
        }
    }
    public void addPrerequisite(){
        try {
            int x = 1 / 0;
            System.out.println("From class Course = addPrerequisite");
        } catch (Exception e) {
            System.out.println("Error adding prerequisite: " + e.getMessage());
        }
    }
    public void checkPrerequisite(){
        try {

            int x = 1 / 0;
            System.out.println("From class Course = checkPrerequisite");
        } catch (Exception e) {
            System.out.println("Error checking prerequisite: " + e.getMessage());
        }
    }
}
