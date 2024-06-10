import java.util.*;
public class AdvancePattern4 {
    public static void main(String args[]){

        int n=5;
        for(int i=1; i<=n; i++){
            // spaces
            int spaces=n-i;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            //1st half nubmers
            for(int j=i; j>=1; j--){
                System.out.print(j + " " );
            }
            //2nd half
            for(int j=2; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();

        }

    }
}
