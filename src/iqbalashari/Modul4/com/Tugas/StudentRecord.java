package iqbalashari.Modul4.com.Tugas;

public class StudentRecord {
    private String name, address;
    private int age;
    private double mathGrade, englishGrade, scienceGrade, average;
    private static int studentCount;

    public String getName(){
        return name;
    }

    public void setName(String temp){
        name = temp;
    }

    public double getAverage(){
        double result = 0;
        result = (mathGrade + englishGrade + scienceGrade) / 3;
        return  result;
    }

    public static int getStudentCount(){
        return studentCount;
    }
}
