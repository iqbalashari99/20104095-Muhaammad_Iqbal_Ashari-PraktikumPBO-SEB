package Modul9.com.Tugas.Latihan.Latihan2;

public class Percobaan {
    public static void main(String[] args) {
        int a[] = new int[5];
        try{
            a[5] = 100;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indeks array melebihi batas");
        }catch (ArithmeticException e){
            System.out.println("Tidak boleh membagi bilangan dengan 0");
        }
    }
}
