/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author araym
 */
public class FactoryApp {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.createManager("dimas");
        Employee e2 = EmployeeFactory.createManager("budi");
        
        Employee e3 = EmployeeFactory.createStaff("hary");
        Employee e4 = EmployeeFactory.createStaff("eki");
        
        Animal tiger = AnimalFactory.create("TIGER");
        Animal cat = AnimalFactory.create("CAT");
        Animal dog = AnimalFactory.create("DOG");
    }
}
