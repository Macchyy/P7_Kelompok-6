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
class Binatang {
    void bersuara() {
        System.out.println("Binatang sedang bersuara");
    }
}

class Kucing extends Binatang {
    void meong() {
        System.out.println("Kucing sedang meong");
    }
}

class Anjing extends Binatang {
    void gonggong() {
        System.out.println("Anjing sedang gonggong");
    }
}

public class Gaga {
    public static void main(String[] args) {
        Kucing binatang1 = new Kucing();
        Anjing binatang2 = new Anjing();


        binatang1.meong(); 
        binatang2.gonggong(); 
    }
}
