public class RoomDimension {
    double length;
    double width;

    //constructs an empty RoomDimension
    public RoomDimension (){

    }
    //constructs a RoomDimension with the given length and width
    public RoomDimension (double lengthIn, double widthIn){
        length = lengthIn;
        width = widthIn;
    }

    //returns the area of RoomDimension
    public double getArea(){
        return length * width;
    }

    //returns the area of RoomDimension  
    public String toString(){
        return getArea() + "" ;
    }
}