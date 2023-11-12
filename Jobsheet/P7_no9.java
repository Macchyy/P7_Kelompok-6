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
class Kendaraan {
    void info() {
        System.out.println("Diatas termasuk kendaraan");
    }
}


class Mobil extends Kendaraan {
    @Override
    void info() {
        System.out.println("Ini adalah mobil");
    }
}


class SepedaMotor extends Kendaraan {
    @Override
    void info() {
        System.out.println("Ini adalah sepeda motor");
    }
}

public class Gaga {
    public static void tampilkanInfo(Kendaraan kendaraan) {
        kendaraan.info();
    }

    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Mobil();
        Kendaraan kendaraan2 = new SepedaMotor();
        Kendaraan kendaraan3 = new Kendaraan();

        tampilkanInfo(kendaraan1);
        tampilkanInfo(kendaraan2); 
        tampilkanInfo(kendaraan3); 
    }
}
