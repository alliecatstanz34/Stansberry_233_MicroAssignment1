public class RoomCarpet {

    RoomDimension size = new RoomDimension();
    double carpetCost;

    public RoomCarpet (RoomDimension dim, double cost){
        size = dim;
        carpetCost = cost;
    }

    //returns the total cost of the carpet with the given carpet area
    //and carpet cost 
    public double getTotal(){
        return size.getArea() * carpetCost;
    }

    //returns _____ as a string 
    public String toString(){
        return size.getArea() + " X " + carpetCost;
    }
}