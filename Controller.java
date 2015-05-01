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
    
    //Elevators to add to array
    private Elevator elevator;
    
    //int to set upper boundry for floors in building
    private int buildingFloors;
    
    //Array of request objects (1 for each floor)
    private Request[] requests;
    
    //Request Stions to add to Controller
    private Request request;
    
    //Queue to track call requests
    private Queue<Request> callQueue;

    /*
     * Constructor for Controller shell
     * int buildingFloors : number of floors in building
     * int numberElevators: number of elevators in building
     */
    public Controller(int buildingFloors, int numberElevators) {
        this.buildingFloors = buildingFloors;
        elevators = new Elevator[numberElevators];
        requests = new Request[buildingFloors];
        populateElevators();
        populateRequestStations();
        listenForCall();
    }
    
    /*
     * Populates elevators for building
     */
    private void populateElevators(){
    
        for(int i = 0; i < elevators.length; i++){
            elevator = new Elevator(requests.length);
            elevators[i] = elevator;
        }
    }
    
    /*
     * populates request stations
     */
    private void populateRequestStations(){
    
        for(int i = 0; i < requests.length; i++){
            request = new Request(i);
            requests[i] = request;
        }
    }
    
    private void listenForCall(){
        /*
         * if call takes place:
         * find closest functional elevator with for loop through elevators
         * move closest elevator to call floor
         * Open elevator door
         * close elevator door
         * move elevator to selected floor
         * open elevator door
         * close elevator door
         * 
         */
    }
    
}
