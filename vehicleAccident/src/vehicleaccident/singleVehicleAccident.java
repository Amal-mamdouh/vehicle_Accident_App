/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleaccident;

import java.util.Date;

public class singleVehicleAccident extends accident {   
    
//    //counter
    private static int counter =0;

    //Multi-constructor
    public singleVehicleAccident(int numberOfCasualties, Date dateAndTime, String collisionRoadLocation, int vehicleAssociated) {
        super(numberOfCasualties, dateAndTime, collisionRoadLocation, vehicleAssociated);
        counter++;
    }

    //Zero-constructor
    public singleVehicleAccident() {
        counter++;
    }
    
    
    //Getters(Accessors)
    public static int getCounter() {
        return counter;
    }

    
    //Setters(Mutators)
    public static void setCounter(int counter) {
        singleVehicleAccident.counter = counter;
    }
    
    
    //to string method Printing all data
    @Override
    public String toString(){
        return super.toString();
    }
    
}