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
import java.util.Date;
//Employee.java
public class Employee {
private static final double BASE_SALARY = 15000.00; private String name;
private double salary; private Date birthDate;

public Employee (String name, double salary, Date DoB){ this.name = name;
this.salary = salary; this.birthDate = DoB;
}

public Employee (String name, double salary){ this (name, salary, null);
}

public Employee(String name, Date DoB){this(name, BASE_SALARY, DoB);
}
public Employee(String name){ this(name, BASE_SALARY);
}
}
//Manager.java
public class Manager extends Employee { private String departement;

public Manager(String name, double salary, String dept){ super(name, salary);
departement = dept;
}

public Manager(String name, String dept){ super(name);
departement = dept;
}
}
//Main.java
public class Main {
public static void main(String[] args) {
Employee man = new Manager("Dori", 16000.00, "Electrcal");
//other code


}
}

