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
    
    //statud of doors open or closed
    private DoorStatus doorStatus;
    
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
        this.doorStatus = DoorStatus.Closed;
    }
    
    //public getters
    public int getCurFloor() {
        return curFloor;
    }

    public SignalStatus getDirectionStatus() {
        return directionStatus;
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }

    //private setters
    private void setCurFloor(int curFloor) {
        this.curFloor = curFloor;
    }

    private void setDirectionStatus(SignalStatus directionStatus) {
        this.directionStatus = directionStatus;
    }

    private void setDoorStatus(DoorStatus doorStatus) {
        this.doorStatus = doorStatus;
    }

    private static void setFloorsMoved(int floorsMoved) {
        Elevator.floorsMoved = floorsMoved;
    }

    private static void setTrips(double trips) {
        Elevator.trips = trips;
    }

    private void setFloorsInBuilding(int floorsInBuilding) {
        this.floorsInBuilding = floorsInBuilding;
    }
    
    public void moveElevator(int floor){
    
        if(floor <= this.floorsInBuilding && floor >= 0){
            if(floor == this.curFloor){
                setDoorStatus(DoorStatus.Open);
            }else{
                if(floor > this.curFloor){
                    setDirectionStatus(SignalStatus.UP);
                    setDoorStatus(DoorStatus.Closed);
                    this.floorsMoved += floor-this.curFloor;
                    
                }
            }
        }
    }
    
}
