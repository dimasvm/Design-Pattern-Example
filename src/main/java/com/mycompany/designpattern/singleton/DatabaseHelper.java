/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpattern.singleton;

/**
 *
 * @author araym
 */
public class DatabaseHelper {
    private static Connection connection;
    
    public static Connection getConnection(){
        if (connection == null) {
            connection = new Connection();
        }
        
        return connection;
    }
}
