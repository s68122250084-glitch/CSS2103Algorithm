package Project2;

public class Section  {
    private String sectionId;
    private int sectionCapacity;
    private int currentSeat;
    private Instructor instructor;
        public Section(){}
        public Section(String sectionId, int sectionCapacity, int currentSeat, Instructor instructor){
            this.sectionId = sectionId;
            this.sectionCapacity = sectionCapacity;
            this.currentSeat = currentSeat;
            this.instructor = instructor;
        }
public String getSectionId() {
        return sectionId;
    }
    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }
    public int getSectionCapacity() {
        return sectionCapacity;
    }
    public void setSectionCapacity(int sectionCapacity) {
        this.sectionCapacity = sectionCapacity;
    }
    public int getCurrentSeat() {
        return currentSeat;
    }
    public void setCurrentSeat(int currentSeat) {
        this.currentSeat = currentSeat;
    }
    public Instructor getInstructor() {
        return instructor;
    }
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }  
    public void checkseat(){
        System.out.println("From class Section = checkseat");
    }
    public void addseat(){
        System.out.println("From class Section = addseat");
    }
    public void removeseat(){
        System.out.println("From class Section = removeseat");
    }
}