package Test;

public class Student {


    private String studentId; //studentId(รหัสนักศึกษา)
    private String name; //name (ชื่อ)
    private String major; //major(สาขาวิชา)
    private double gpa;  //gpa (เกรดเฉลี่ย)

    //1. สร้าง constructor เพื่อกำหนดค่าข้อมูลทั้งหมด
public Student(String studentId, String name, String major, double gpa) {
    this.studentId = studentId;
    this.name = name;
    this.major = major;
    this.gpa = gpa;
}


    //2. สร้างเมธอด displayInfo() เพื่อแสดงข้อมูลนักศึกษา
    public void displayInfo() {
        System.out.print("รหัสนักเรียน: " + studentId);
        System.out.print(" ชื่อ: " + name);
        System.out.print(" สาขา: " + major);
        System.out.print(" GPA: " + gpa);
        System.out.println();
    }
}
