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
 import java.util.ArrayList;

class Karyawan {
    // ...
}

class Manajer extends Karyawan {
    // ...
}

class Kurir extends Karyawan {
    // ...
}

public class Utama {
    public static void proses(Karyawan karyawan) {
        if (karyawan instanceof Manajer) {
            
            System.out.println("Memproses Manajer");
        } else if (karyawan instanceof Kurir) {
            
            System.out.println("Memproses Kurir");
        } else {
            System.out.println("Memproses Karyawan Lainnya");
        }
    }

    public static void main(String[] args) {
        ArrayList<Karyawan> staf = new ArrayList<>();
        staf.add(new Manajer());
        staf.add(new Kurir());

        for (Karyawan karyawan : staf) {
            proses(karyawan);
        }
    }
}

