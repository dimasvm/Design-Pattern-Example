/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpattern.singleton;

/**
 *
 * @author araym
 */
public class SingletonApp {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.save(new Order());
        
        OrderDetailService orderDetailService = new OrderDetailService();
        orderDetailService.save(new Order());
        orderDetailService.save(new Order());
        orderDetailService.save(new Order());
        
    }
}
