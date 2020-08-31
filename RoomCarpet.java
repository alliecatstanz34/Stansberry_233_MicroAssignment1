public class RoomCarpet {

    RoomDimension size = new RoomDimension();
    double carpetCost;

    //constructs a RoomCarpet object with the given RoomDimension and cost 
    public RoomCarpet (RoomDimension dim, double cost){
        size = dim;
        carpetCost = cost;
    }

    //returns as a double, the total cost of the carpet with the given carpet area
    //and carpet cost 
    public double getTotal(){
        return size.getArea() * carpetCost;
    }

    //returns total cost as a string 
    public String toString(){
        return getTotal() + "";
    }
}