package Test;

public class TestStudentMain {
    public static void main(String[] args) {

        // สร้าง array ของ reference
        Student[] students = new Student[3];

        // สร้าง object แล้วเก็บใน array
        students[0] = new Student("65001", "สมชาย", "คอมพิวเตอร์", 3.25);
        students[1] = new Student("65002", "สมหญิง", "เทคโนโลยีสารสนเทศ", 3.80);
        students[2] = new Student("65003", "อนันต์", "วิศวกรรมซอฟต์แวร์", 2.95);

        // แสดงข้อมูลทั้งหมดด้วย loop
        for (int i = 0; i < students.length; i++) {
            students[i].displayInfo();
        }
    }
}
