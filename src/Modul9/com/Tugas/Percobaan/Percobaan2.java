package Modul9.com.Tugas.Percobaan;

public class Percobaan2 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil/0);
        }catch (Throwable e){
//            System.out.println("Tidak boleh membagi bilangan dengan 0");
            System.out.println(e);
        }
    }
}
