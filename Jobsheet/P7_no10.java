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
import java.util.Scanner;

class Employee {
    private String name;
    private double salary;
    private static double salary_rise_percent = 0.2;

    // Konstruktor
    public Employee(String nm, double sly) {
        this.setName(nm);
        this.setSalary(sly);
    }

    // Setter dan Getter
    public void setName(String nm) {
        name = nm;
    }

    public void setSalary(double sly) {
        salary = sly;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static double getPresentase() {
        return salary_rise_percent;
    }

    // Metode untuk menaikkan gaji
    public void salaryUp() {
        salary += (salary * salary_rise_percent);
    }

    // Setter untuk presentase kenaikan gaji
    public static void setPresentase(double percent) {
        salary_rise_percent = percent;
    }
}

class Manager extends Employee {
    private static double bonus = 500;

    // Konstruktor
    public Manager(String nm, double sly) {
        super(nm, sly);
    }

    // Getter dan Setter untuk bonus
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bns) {
        bonus = bns;
    }

    // Override metode getSalary untuk menghitung gaji total
    @Override
    public double getSalary() {
        double salaryBase = super.getSalary();
        return (salaryBase + bonus);
    }
}

public class Gaga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama manager: ");
        String namaManager = scanner.nextLine();

        System.out.print("Masukkan gaji manager: ");
        double gajiManager = scanner.nextDouble();

        Manager manager = new Manager(namaManager, gajiManager);

        System.out.println("Nama: " + manager.getName());
        System.out.println("Bonus: " + manager.getBonus());
        System.out.println("Gaji Total: " + manager.getSalary());
    }
}
