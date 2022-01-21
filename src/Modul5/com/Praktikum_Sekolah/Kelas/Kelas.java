package Modul5.com.Praktikum_Sekolah.Kelas;

import Modul5.com.Praktikum_Sekolah.Mahasiswa.Mahasiswa;

public class Kelas {
    private int kodeKelas;
    private String namaKelas;
    private Mahasiswa[] mahasiswa = new Mahasiswa[10];
    private int mahasiswaLength;

    public Kelas(int kodeKelas, String namaKelas) {
        this.kodeKelas = kodeKelas;
        this.namaKelas = namaKelas;
        this.mahasiswaLength = -1;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        mahasiswaLength++;
        this.mahasiswa[mahasiswaLength] = mahasiswa;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public Mahasiswa[] getMahasiswa() {
        Mahasiswa[] mahasiswaReturn = new Mahasiswa[mahasiswaLength + 1];
        for (int i = 0; i <= mahasiswaLength; i++) {
            mahasiswaReturn[i] = mahasiswa[i];
        }
        return mahasiswaReturn;
    }
}
