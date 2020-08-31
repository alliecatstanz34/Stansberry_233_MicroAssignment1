
/*
Name: Allison Stansberry
CPT_S 233: Micro Assignment #1
Date: 08/30/2020
GIT Repo URL: https://github.com/alliecatstanz34/Stansberry_233_MicroAssignment1  
*/

public class Main {
    
    public static void main (String [] args){
        RoomDimension test = new RoomDimension(3,4);

        RoomCarpet testCarpet = new RoomCarpet(test, 7);

        System.out.println("Total area: " + test.getArea());
        System.out.println("Dimensions: " + test.toString());
        System.out.println("Total Cost: " + testCarpet.getTotal());
        System.out.println("Area and Cost: " + testCarpet.toString());
    }
}