/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

import abstractfactory.arena.Arena;
import abstractfactory.arena.ArenaEasy;
import abstractfactory.level.Level;
import abstractfactory.level.LevelEasy;

/**
 *
 * @author araym
 */
public class GameFactoryEasy implements GameFactory {

    @Override
    public Level createLevel() {
        return new LevelEasy();
    }

    @Override
    public Arena createArena() {
        return new ArenaEasy();
    }
    
}
