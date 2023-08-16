/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleaccident;

/**
 *
 * @author lenovo
 */
import java.util.Date;

public class rearEndAccident extends accident {
    private static int counter =0; //Counter

    //Multi-constructor
    public rearEndAccident(int numberOfCasualties, Date dateAndTime, String collisionRoadLocation, int vehicleAssociated) {
        super(numberOfCasualties, dateAndTime, collisionRoadLocation, vehicleAssociated);
        counter++;
    }
    
    
    //Zero-constructor
    public rearEndAccident() {
        counter++;
    }

    //getters
    public static int getCounter() {
        return counter;
    }
    
    
    //setters
    public static void setCounter(int counter) {
        rearEndAccident.counter = counter;
    }
    
    
    //to string method Printing all data
    @Override
    public String toString(){
        return super.toString();
    }
    
}
