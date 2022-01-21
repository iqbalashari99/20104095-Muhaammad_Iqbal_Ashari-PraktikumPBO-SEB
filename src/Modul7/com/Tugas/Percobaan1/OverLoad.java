package Modul7.com.Tugas.Percobaan1;

public class OverLoad {
    void myOverload(A a){
        System.out.println("Overload.myOverload(A a");
    }

    void myOverload(B b){
        System.out.println("Overload.myOverload(B b");
    }

    public static void main(String[] args) {
        OverLoad o = new OverLoad();
        A a = new A();
        C c = new C();

        o.myOverload(a);
        o.myOverload(c);
        /*
          *statement di atas akan menjalankan myOverload(B
          b), karena
          * *method tersebut lebih "dekat" dengan method yang dicari
          * *bila dibandingkan dengan myOverload(A a)
         */
    }
}
