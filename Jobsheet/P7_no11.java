/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7;

/**
 *
 * @author ASUS
 */
class Person {
    String nama = "Fauzan";
    int usia = 21;
}

class Dosen extends Person {
    float gaji = 200000f;

    void tampilkanInfo() {
        System.out.println("Nama: " + super.nama);
        System.out.println("Usia: " + super.usia);
        System.out.println("Gaji: Rp" + gaji);
    }
}


class Mahasiswa extends Person {
    String jurusan;

    Mahasiswa(String nama, int usia, String jurusan) {
        this.nama = nama;
        this.usia = usia;
        this.jurusan = jurusan;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Usia: " + this.usia);
        System.out.println("Jurusan: " + this.jurusan);
    }
}


public class Gaga {
    public static void main(String[] args) {
        Dosen rismon = new Dosen();
        rismon.tampilkanInfo();

        System.out.println("\nInformasi Mahasiswa:");
        Mahasiswa mahasiswa = new Mahasiswa("Fauzan Al-Farisi", 21, "Elektro");
        mahasiswa.tampilkanInfo();
    }
}
