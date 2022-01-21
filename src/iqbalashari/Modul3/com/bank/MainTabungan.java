package iqbalashari.Modul3.com.bank;

import java.util.Scanner;

public class MainTabungan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saldo awal tabungan\t: ");
        int isi = scanner.nextInt();
        Tabungan tabungan = new Tabungan(isi);

        System.out.println("Jumlah uang yang diambil\t: ");
        int ambil = scanner.nextInt();
        tabungan.Ambiluang(ambil);

        System.out.println("Saldo Tabungan sekarang\t ");
        System.out.println(tabungan.getSaldo());
    }
}

