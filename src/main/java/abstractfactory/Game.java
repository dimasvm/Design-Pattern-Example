/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

import abstractfactory.arena.Arena;
import abstractfactory.level.Level;

/**
 *
 * @author araym
 */
public class Game {
    private Level level;
    private Arena arena;
    
    public Game(GameFactory gameFactory) {
        this.level = gameFactory.createLevel();
        this.arena = gameFactory.createArena();
    }
   
    public void start(){
        level.start();
        arena.start();
    }
}
