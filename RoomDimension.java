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

    //returns the length and width of RoomDimension as string 
    public String toString(){
        return length + " X " + width;
    }
}