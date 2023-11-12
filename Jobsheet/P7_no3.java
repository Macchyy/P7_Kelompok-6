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
class Mobil {
    String merek;

    Mobil(String merek) {
        this.merek = merek;
    }

    void berkendara() {
        System.out.println("Mobil " + merek + " sedang berkendara");
    }
}

class Sedan extends Mobil {
    Sedan(String merek) {
        super(merek);
    }

    @Override
    void berkendara() {
        System.out.println("Sedan " + merek + " sedang berkendara");
    }
}

class SUV extends Mobil {
    SUV(String merek) {
        super(merek);
    }

    @Override
    void berkendara() {
        System.out.println("SUV " + merek + " sedang berkendara");
    }
}

public class Kendaraan {
    public static void Proses(Mobil mobil) {
        if (mobil instanceof Sedan) {
            Sedan sedan = (Sedan) mobil; 
            sedan.berkendara();
        } else if (mobil instanceof SUV) {
            SUV suv = (SUV) mobil; 
            suv.berkendara();
        } else {
            System.out.println("Memproses Mobil Lainnya");
        }
    }

    public static void main(String[] args) {
        Mobil sedan = new Sedan("Toyota");
        Mobil suv = new SUV("Honda");

        Proses(sedan);
        Proses(suv);
    }
}
