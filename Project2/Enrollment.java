package Project2;

import java.util.Date;

public class Enrollment {
    private Date enrollmentdate;
    private String status;
    public Enrollment() {}
    public Enrollment(Date enrollmentdate, String status) {
        this.enrollmentdate = enrollmentdate;
        this.status = status;
    }
    public Date getEnrollmentdate() {
        return enrollmentdate;
    }
    public void setEnrollmentdate(Date enrollmentdate) {
        try {
            int x = 1 / 0;
            System.out.println("From class Enrollment = setEnrollmentdate");
            this.enrollmentdate = enrollmentdate;
        } catch (Exception e) {
            System.out.println("Error setting enrollment date: " + e.getMessage());
        }
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        try {
            System.out.println("From class Enrollment = setStatus");
            this.status = status;
        } catch (Exception e) {
            System.out.println("Error setting status: " + e.getMessage());
        }
    }

    public void confirm(){
        try{
            int x = 1 / 0;
        System.out.println("From class Enrollment = confirm");
        } catch (Exception e) {
            System.out.println("Error confirming enrollment: " + e.getMessage());
        }
    }
    public void cancel(){
        try {
            int x = 1 / 0;
            System.out.println("From class Enrollment = cancel");
        } catch (Exception e) {
            System.out.println("Error canceling enrollment: " + e.getMessage());
        }
    }
}