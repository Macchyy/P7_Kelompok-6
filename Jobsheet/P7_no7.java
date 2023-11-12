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
        System.out.println("Ini adalah kendaraan");
    }
}

class Mobil extends Kendaraan {
    void infoMobil() {
        System.out.println("Ini mobil");
    }
}

class SepedaMotor extends Kendaraan {
    void infoSepedaMotor() {
        System.out.println("Ini sepeda motor");
    }
}

public class Gaga {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Mobil();

        if (kendaraan instanceof Mobil) {
            Mobil mobil = (Mobil) kendaraan;
            mobil.infoMobil();
        }

        Kendaraan kendaraan2 = new SepedaMotor();
        if (kendaraan2 instanceof SepedaMotor) {
            SepedaMotor sepedaMotor = (SepedaMotor) kendaraan2;
            sepedaMotor.infoSepedaMotor();
        }
    }
}
