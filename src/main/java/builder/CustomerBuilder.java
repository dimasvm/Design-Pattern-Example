package builder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author araym
 */
public class CustomerBuilder {
    private String id;
    private String code;
    private String name;

    public CustomerBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public CustomerBuilder setCode(String code) {
        this.code = code;
        return this;
    }

    public CustomerBuilder setName(String name) {
        this.name = name;
        return this;
    }
    
    public Customer build() {
        return new Customer(this.id, this.code, this.name);
    }
    
    
}
