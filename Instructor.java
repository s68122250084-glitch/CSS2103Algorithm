package Project2;
import java.util.List;

public class Instructor {
    private String instructorId;
    private String instructorName;
    private List<Section> sectionTeaching;
        public Instructor() {}
        public Instructor(String instructorId, String instructorName, List<Section> sectionTeaching){
            this.instructorId = instructorId;
            this.instructorName = instructorName;
            this.sectionTeaching = sectionTeaching;
        }
    public String getInstructorId() {
        return instructorId;
    }
    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }
    public String getInstructorName() {
        return instructorName;
    }
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
    public List<Section> getSectionTeaching() {
        return sectionTeaching;
    }
    public void setSectionTeaching(List<Section> sectionTeaching) {
        this.sectionTeaching = sectionTeaching;
    }

    public void assign(Section section) {
        System.out.println("From class Instructor = assign");
    }
}