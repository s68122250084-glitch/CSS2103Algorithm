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
        this.day = day;
    }
    public String getDay() {
        return day;
    }
    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }
    public Time getStartTime() {
        return startTime;
    }
    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }
    public Time getEndTime() {
        return endTime;
    }
    public void setRoom(String room) {
        this.room = room;
    }
    public String getRoom() {
        return room;
    }
    public void checkConflict() {
        System.out.println("From class Schedule = checkConflict");
    }
}