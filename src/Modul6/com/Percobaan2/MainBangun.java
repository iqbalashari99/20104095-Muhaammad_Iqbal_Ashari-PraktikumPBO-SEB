package Modul6.com.Percobaan2;

import Modul6.com.Percobaan1.Persegi;
import Modul6.com.Percobaan2.subbangun.Lingkaran;
import Modul6.com.Percobaan2.subbangun.PersegiPanjang;
import Modul6.com.Percobaan2.subbangun.Segitiga;


public class MainBangun {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setSisi(5);
        persegi.getLuas();
        persegi.keliling();

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJariJari(14);
        lingkaran.luas();
        lingkaran.keliling();

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPanjang(11);
        persegiPanjang.setLebar(6);
        System.out.println("PP Luas\t: " + persegiPanjang.luas());
        System.out.println("PP Kel\t: " + persegiPanjang.keliling());

        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(7);
        segitiga.setTinggi(10);
        segitiga.luas();
        segitiga.keliling();

    }
}
