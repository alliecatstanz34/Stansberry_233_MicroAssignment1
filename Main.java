
/*
Name: Allison Stansberry
CPT_S 233: Micro Assignment #1
Date: 08/30/2020
GIT Repo URL: https://github.com/alliecatstanz34/Stansberry_233_MicroAssignment1  
*/

import java.util.Scanner;

public class Main {
    
    public static void main (String [] args){

        double length, width;
        double pricePerFoot;
        RoomDimension newRoom;
        RoomCarpet newRoomPrice;
        Scanner readme = new Scanner(System.in);
        
        //asks user for the dimensions of the room they want to carpet 
        System.out.println("Enter the length then width, in feet, of the room you wish to carpet: ");
        System.out.println("Press Enter after each input: ");
        
        //makes a new room with the dimensions given by the user 
        length = readme.nextDouble();
        width = readme.nextDouble();
        newRoom = new RoomDimension(length, width);
        
        //asks user for the price of the carpet per square foot
        System.out.println("Enter the cost of the carpet per square foot: ");
        System.out.println("Press Enter after input: ");

        //makes a new RoomCarpet with the price and demensions given by the user
        pricePerFoot = readme.nextDouble();
        newRoomPrice = new RoomCarpet(newRoom, pricePerFoot);

        //displays the total cost of the carpet 
        System.out.println("The total cost for carpet in your room is: " + newRoomPrice);

        readme.close();
    }
}