/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;


/**
 *
 * @author araym
 */
public class BuilderApp {
    
    public static void main(String[] args) {
        CustomerBuilder builder = new CustomerBuilder();
        Customer customer1 = new CustomerBuilder()
                .setCode("2")
                .build();
    }

}
