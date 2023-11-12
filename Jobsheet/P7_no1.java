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
 class Tumbuhan {
    void tanam() {
        System.out.println("tumbuhan ditanam");
    }
 void berkembang() {
        System.out.println("tumbuhan tumbuh");
    }
}

class Pohon extends Tumbuhan {
    @Override
    void tanam() {
        System.out.println("pohon ditanam");
    }

    @Override
    void berkembang() {
        System.out.println("Pohon tumbuh");
    }
}

class Bunga extends Tumbuhan {
    @Override
    void tanam() {
        System.out.println("bunga ditanam");
    }

    @Override
    void berkembang() {
        System.out.println("Bunga tumbuh");
    }
}

public class Flora {
    public static void main(String[] args) {
        Tumbuhan pohon = new Pohon();
        Tumbuhan bunga = new Bunga();


        pohon.tanam();
        pohon.berkembang();
        
        bunga.tanam();
        bunga.berkembang();
    }
}
