/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpattern.singleton;

/**
 *
 * @author araym
 */
public class Order {
    private String id;
    private String code;
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getCode(){
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
}
