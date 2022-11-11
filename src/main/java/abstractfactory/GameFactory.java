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
interface GameFactory {
    public Level createLevel();
    public Arena createArena();
}
