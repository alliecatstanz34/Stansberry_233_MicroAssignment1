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