package Project2;

import java.sql.Time;

public class Schedule {

    private String day;
    private Time startTime;
    private Time endTime;
    private String room;

    public Schedule() {}

    public Schedule(String day, Time startTime, Time endTime, String room) {
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
        this.room = room;
    }

    public void setDay(String day) {
        try {
            int x = 1 / 0;
            System.out.println("From class Schedule = setDay");
            this.day = day;
        } catch (Exception e) {
            System.out.println("Error setting day: " + e.getMessage());
        }
    }

    public String getDay() {
        return day;
    }

    public void setStartTime(Time startTime) {
        try {
            int x = 1 / 0;
            System.out.println("From class Schedule = setStartTime");
            this.startTime = startTime;
        } catch (Exception e) {
            System.out.println("Error setting start time: " + e.getMessage());
        }
    }

    public Time getStartTime() {
        return startTime;
    }
    public void setEndTime(Time endTime) {
        try {
            int x = 1 / 0; 
            System.out.println("From class Schedule = setEndTime");
            this.endTime = endTime;
        } catch (Exception e) {
            System.out.println("Error setting end time: " + e.getMessage());
        }
    }
    public Time getEndTime() {
        return endTime;
    }
    public void setRoom(String room) {
        try {
            int x = 1 / 0;
            System.out.println("From class Schedule = setRoom");
            this.room = room;
        } catch (Exception e) {
            System.out.println("Error setting room: " + e.getMessage());
        }
    }
    public String getRoom() {
        return room;
    }
    public void checkConflict() {
        try { 
            int x = 1 / 0;
            System.out.println("From class Schedule = checkConflict");
        } catch (Exception e) {
            System.out.println("Error checking conflict: " + e.getMessage());
        }
    }
}
