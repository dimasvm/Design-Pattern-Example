/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author araym
 */
public class AnimalFactory {
    public static Animal create(String type) {
        if (type == null || type.isEmpty()) return null;
        
        switch (type) {
            case "TIGER":
                return new Tiger();
            case "CAT":
                return new Cat();
            case "DOG":
                return new Dog();
            default:
                throw new IllegalArgumentException("Unknown type " + type);
        }
    }
}
