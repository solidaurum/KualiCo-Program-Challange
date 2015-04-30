/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elevatorsimulation;


/**
 *
 * @author Ammon
 */
public enum SignalStatus {
    //Up button pushed or Elevator moving up
    UP,
    
    //Down button pushed or elevator moving down
    Down,
    
    //Elevator has stopped
    Stopped,
    
    //No Button pushed.
    Null,
}
