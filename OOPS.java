 class Pen{
    String colour;
    String type; // ballpoint ; gel

    public void write(){
        System.out.println("Write something");
    }
    public void printColour(){
        System.out.println(this.colour);
    }
}

public class OOPS {
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.colour = "black";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.colour = "blue";
        pen2.type = "ballpoint";


        pen1.printColour();
        pen2.printColour();
    }
    
}
