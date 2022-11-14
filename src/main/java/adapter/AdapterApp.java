package adapter;

import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author araym
 */
public class AdapterApp {
    public static void main(String[] args) {
        List <CatalogAdapter> list = new ArrayList<>();
        
        list.add(new BookCatalogAdapter(new Book("Pemrograman Java", "Dimas")));
        list.add(new BookCatalogAdapter(new Book("Pemrograman PHP", "Maulana")));
        list.add(new BookCatalogAdapter(new Book("Pemrograman React", "Hardy")));
        
        list.add(new ScreencastCatalogAdapter(new Screencast("Belajar Design Pattern", "Dimas", "")));
        list.add(new ScreencastCatalogAdapter(new Screencast("Belajar SOLID Principles", "Maulana", "")));
        
        list.forEach(it -> {
            System.out.println(it.getTitle());
        });
    }
}
