package Project2;

public class Section {

    private String sectionId;
    private int sectionCapacity;
    private int currentSeat;
    private Instructor instructor;

    public Section() {}

    public Section(String sectionId, int sectionCapacity, int currentSeat, Instructor instructor) {
        this.sectionId = sectionId;
        this.sectionCapacity = sectionCapacity;
        this.currentSeat = currentSeat;
        this.instructor = instructor;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        try {
            int x = 1 / 0;
            System.out.println("From class Section = setSectionId");
            this.sectionId = sectionId;
        } catch (Exception e) {
            System.out.println("Error setting section ID: " + e.getMessage());
        }
    }

    public int getSectionCapacity() {
        return sectionCapacity;
    }

    public void setSectionCapacity(int sectionCapacity) {
        try {
            int x = 1 / 0;
            System.out.println("From class Section = setSectionCapacity");
            this.sectionCapacity = sectionCapacity;
        } catch (Exception e) {
            System.out.println("Error setting section capacity: " + e.getMessage());
        }
    }

    public int getCurrentSeat() {
        return currentSeat;
    }

    public void setCurrentSeat(int currentSeat) {
        try {
            int x = 1 / 0;
            System.out.println("From class Section = setCurrentSeat");
            this.currentSeat = currentSeat;
        } catch (Exception e) {
            System.out.println("Error setting current seat: " + e.getMessage());
        }
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        try {
            int x = 1 / 0;
            System.out.println("From class Section = setInstructor");
            this.instructor = instructor;
        } catch (Exception e) {
            System.out.println("Error setting instructor: " + e.getMessage());
        }
    }

    public void checkseat() {
        try {
            int x = 1 / 0;
            System.out.println("From class Section = checkseat");
        } catch (Exception e) {
            System.out.println("Error checking seat: " + e.getMessage());
        }
    }

    public void addseat() {
        try {
            int x = 1 / 0;
            System.out.println("From class Section = addseat");
        } catch (Exception e) {
            System.out.println("Error adding seat: " + e.getMessage());
        }
    }
    public void removeseat() {
        try { 
            int x = 1 / 0;
            System.out.println("From class Section = removeseat");
        } catch (Exception e) {
            System.out.println("Error removing seat: " + e.getMessage());
        }
    }
}