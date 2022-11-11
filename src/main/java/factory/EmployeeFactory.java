/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author araym
 */
public class EmployeeFactory {
    public static Employee createManager(String name) {
        return new Employee(name, "Manager", 10000);
    }
    
    public static Employee createStaff(String name) {
        return new Employee(name, "Staff", 5000);
    }
}
