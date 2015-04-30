/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elevatorsimulation;

/**
 *
 * @author Ammon
 */
public class Request {
    //int for objects placement in building
    private int floorNumber;
    
    //direction button on device
    private SignalStatus direction;
    
    //call request status
    private RequestStatus rStatus;
    
    /*
     * Constuctor for request station
     */
    public Request(int fNumber){
        this.floorNumber = fNumber;
        this.direction = SignalStatus.Null;
        this.rStatus = RequestStatus.Filled;
    }
    
    
}
