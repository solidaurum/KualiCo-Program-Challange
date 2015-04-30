/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elevatorsimulation;

/**
 *
 * @author Ammon
 */
public class Elevator {
    //int to keep track of current floor
    private int curFloor;
    
    //status of movement of elevator up, down or stopped
    private SignalStatus directionStatus;
    
    //static member to keep track of floors moved
    private static int floorsMoved;
    
    //static member to keep track of trips made
    //trips = floorsMoved/(2*floorsInBuilding)
    private static double trips;
    
    //int defining number of floors in building
    private int floorsInBuilding;
    
    /*
     * Elevator constructor
     */
    public Elevator(int floors){
        this.floorsInBuilding = floors;
        this.curFloor = 0;
        this.directionStatus = SignalStatus.Stopped;
        this.floorsMoved = 0;
        this.trips = 0;
    }

    public int getCurFloor() {
        return curFloor;
    }

    public SignalStatus getDirectionStatus() {
        return directionStatus;
    }
    
    
}
