/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elevatorsimulation;

import java.util.Queue;

/**
 *
 * @author Ammon
 */
public class Controller {
    //Array to store status of elevators in building
    private Elevator[] elevators;
    
    //int to set upper boundry for floors in building
    private int buildingFloors;
    
    //Array of request objects (1 for each floor)
    private Request[] requests;
    
    //Queue to track call requests
    private Queue<requests> callQueue;
    
    
}
