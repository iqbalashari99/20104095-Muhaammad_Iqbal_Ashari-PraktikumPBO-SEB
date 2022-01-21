package iqbalashari.Modul3.com.bank;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public void Ambiluang(int jumlah) {
        //Substraction assigment
        //saldo = saldo - jumlah;
        saldo -= jumlah;
    }

    public int getSaldo() {
        return saldo;
    }

    public void simpanUang(int i) {
    }

    public boolean ambilUang(int i) {

        return false;
    }
}

