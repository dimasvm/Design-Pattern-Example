package factory;


import factory.Animal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author araym
 */
public class Dog implements Animal {

    @Override
    public String speak() {
        return "gug gug";
    }
    
}
