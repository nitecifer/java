import java.util.*;
public class Bits {
    public static void main(String args[]){
        int n = 5; 
        int pos = 2; 
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);

        // if ((bitMask & n) == 0) {
        //     System.out.println("bit was zero");
            
        // }else{
        //     System.out.println("bit was one");
        // }

       int  newNumber = notBitMask & n ;
       System.out.println(newNumber);

        
    }
    
}
