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
public class Gaga {
    static int bandingkan(int nilai1, int nilai2) {
        System.out.println("Membandingkan dua nilai integer:");
        if (nilai1 > nilai2) {
            return 1;
        } else if (nilai1 < nilai2) {
            return -1;
        } else {
            return 0;
        }
    }

    static double bandingkan(double nilai1, double nilai2) {
        System.out.println("Membandingkan dua nilai double:");
        if (nilai1 > nilai2) {
            return 1.0;
        } else if (nilai1 < nilai2) {
            return -1.0;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        int hasilInt = bandingkan(5, 10);
        System.out.println("Hasil perbandingan integer: " + hasilInt);

        double hasilDouble = bandingkan(3.5, 2.0);
        System.out.println("Hasil perbandingan double: " + hasilDouble);
    }
}
