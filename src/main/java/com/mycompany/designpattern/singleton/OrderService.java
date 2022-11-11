/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpattern.singleton;

/**
 *
 * @author araym
 */
public class OrderService {
    private Connection connection;
    
    public OrderService() {
        connection = DatabaseHelper.getConnection();
    }
    
    public void save(Order order){
        connection.sql("INSERT INTO ...");
    }
}
