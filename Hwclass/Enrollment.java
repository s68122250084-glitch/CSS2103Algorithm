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
        this.enrollmentdate = enrollmentdate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public void confirm(){
        System.out.println("From class Enrollment = confirm");
    }
    public void cancel(){
        System.out.println("From class Enrollment = cancel");
    }
}