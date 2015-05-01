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
    
    //status of doors open or closed
    private DoorStatus doorStatus;
    
    //status of maintenance need
    private Maintenance maintenance;
    
    // member to keep track of floors moved
    private int floorsMoved;
    
    //member to keep track of trips made
    //trips = floorsMoved/(2*floorsInBuilding)
    private double trips;
    
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
        this.maintenance = Maintenance.Functional;
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

    public int getFloorsMoved(){
        return this.floorsMoved;
    }

    public Maintenance getMaintenance() {
        return maintenance;
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

    private void setFloorsMoved(int floorsMoved) {
        this.floorsMoved = floorsMoved;
    }

    private void setTrips(double trips) {
        this.trips = trips;
    }

    private void setFloorsInBuilding(int floorsInBuilding) {
        this.floorsInBuilding = floorsInBuilding;
    }

    private void setMaintenance(Maintenance maintenance) {
        this.maintenance = maintenance;
    }
    
    public String moveElevator(int floor){
    
        String message;
        if(floor <= this.floorsInBuilding && floor >= 0){
            if(floor == this.curFloor){
                setDoorStatus(DoorStatus.Open);
            }else{
                if(floor > this.curFloor){
                    setDirectionStatus(SignalStatus.UP);
                    setDoorStatus(DoorStatus.Closed);
                    for(int i = 0; i < (floor-this.curFloor); i++){
                        this.floorsMoved++;
                        checkLimit();
                        if(this.maintenance == Maintenance.OutOfOrder){
                            setDirectionStatus(SignalStatus.Stopped);
                            setDoorStatus(doorStatus.Open);
                            message = "Fail";
                            return message;
                            
                        }
                    }
                    setDoorStatus(DoorStatus.Open);
                }
            }
        }
        message = "Success";
        return message;
    }
    
    private void checkLimit(){
        setTrips(this.floorsMoved/(this.floorsInBuilding * 2));//round trip two times total number of floors
        if(this.trips >= 100){
            setMaintenance(Maintenance.OutOfOrder);
        }
    }
    
    
}
