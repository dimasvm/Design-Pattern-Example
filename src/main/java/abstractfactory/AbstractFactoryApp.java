/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

import abstractfactory.arena.ArenaEasy;
import abstractfactory.level.LevelEasy;

/**
 *
 * @author araym
 */
public class AbstractFactoryApp {
    public static void main(String[] args) {
        Game gameEasy = new Game(new GameFactoryEasy());
    }
}
