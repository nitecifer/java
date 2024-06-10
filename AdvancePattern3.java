import java.util.*;
public class AdvancePattern3 {
    public static void main(String args[]){
        int n=5;
        
        for(int i=1; i<=n; i++){
            //spaces
            int spaces=n-i;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            //numbers -> print row numbers row times
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");

            }
            System.out.println();

        }

    }
}
