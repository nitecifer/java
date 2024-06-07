/**import java.util.*;
public class PatternExample {
    public static void main(String args[]){
        int n=5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

import java.util.*;
public class PatternExample {
    public static void main(String args[]){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
// Floyd's Triangle
 import java.util.*;
 public class PatternExample {
    public static void main(String args[]){
        int n=5; 
        int number=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
   }
}*/
import java.util.*;
public class PatternExample {
    public static void main(String args[]){
        int n=5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
               int sum = i+j; 
                    if(sum % 2 == 0){ //even
                        System.out.print("1 ");
                    }else{ //odd
                        System.out.print("0 ");
                    }
            }
            System.out.println();

        }

    }
}
        
        

        