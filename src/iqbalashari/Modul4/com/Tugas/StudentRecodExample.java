package iqbalashari.Modul4.com.Tugas;

public class StudentRecodExample {
    public static void main(String[] args) {
        StudentRecord Wahyu = new StudentRecord();
        StudentRecord Ini = new StudentRecord();
        StudentRecord Nama = new StudentRecord();

        Wahyu.setName("Wahyu");
        Ini.setName("Ini");
        Nama.setName("Nama");

        System.out.println(Wahyu.getName());
        System.out.println("Hitung\t: " + StudentRecord.getStudentCount());
    }
}
