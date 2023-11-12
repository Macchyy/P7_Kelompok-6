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
class Manusia {
    String nama;

    Manusia(String nama) {
        this.nama = nama;
    }

    void bekerja() {
        System.out.println(nama + " sedang bekerja");
    }
}

class Pekerja extends Manusia {
    Pekerja(String nama) {
        super(nama);
    }

    void bekerjaKeras() {
        System.out.println(nama + " sedang bekerja ");
    }
}

class Pengantar extends Manusia {
    Pengantar(String nama) {
        super(nama);
    }

    void antarBarang() {
        System.out.println(nama + " sedang mengantar barang");
    }
}

public class Utama {
    public static void Proses(Manusia manusia) {
        if (manusia instanceof Pekerja) {
            Pekerja pekerja = (Pekerja) manusia; 
            pekerja.bekerjaKeras();
        } else if (manusia instanceof Pengantar) {
            Pengantar pengantar = (Pengantar) manusia; 
            pengantar.antarBarang();
        } else {
            System.out.println(manusia.nama + " sedang bekerja");
        }
    }

    public static void main(String[] args) {
        Pekerja pekerja = new Pekerja("Fauzan");
        Pengantar pengantar = new Pengantar("Fatah");

        Proses(pekerja);
        Proses(pengantar);
    }
}

