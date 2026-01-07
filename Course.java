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
        this.courseId = courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public List<Course> getPrerequisites() {
        return Prerequisites;
    }
    public void setPrerequisites(List<Course> prerequisites) {
        Prerequisites = prerequisites;
    }
    public void addPrerequisite(){
        System.out.println("From class Course = addPrerequisite");
    }
    public void checkPrerequisite(){
        System.out.println("From class Course = checkPrerequisite");
    }
}