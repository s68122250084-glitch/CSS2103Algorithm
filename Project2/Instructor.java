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
        try {
            int x = 1 / 0;
            System.out.println("From class Instructor = setInstructorId");
            this.instructorId = instructorId;
        } catch (Exception e) {
            System.out.println("Error setting instructor ID: " + e.getMessage());
        }
    }
    public String getInstructorName() {
        return instructorName;
    }
    public void setInstructorName(String instructorName) {
        try {
            int x = 1 / 0;
            System.out.println("From class Instructor = setInstructorName");
            this.instructorName = instructorName;
        } catch (Exception e) {
            System.out.println("Error setting instructor name: " + e.getMessage());
        }
    }
    public List<Section> getSectionTeaching() {
        return sectionTeaching;
    }
    public void setSectionTeaching(List<Section> sectionTeaching) {
        try { 
            int x = 1 / 0;
            System.out.println("From class Instructor = setSectionTeaching");
            this.sectionTeaching = sectionTeaching;
            
        } catch (Exception e) {
            System.out.println("Error setting section teaching: " + e.getMessage());
        }
    }

    public void assign(Section section) {
        try {
            int x = 1 / 0;
            System.out.println("From class Instructor = assign");
            this.sectionTeaching.add(section);
        } catch (Exception e) {
            System.out.println("Error assigning section: " + e.getMessage());
        }
    }
}