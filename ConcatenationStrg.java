import java.util.*;
public class ConcatenationStrg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Concatation
        String firstName = "Iron";
        String lastName = "Man";
        String fullName = firstName + " " + lastName ;
        System.out.println(fullName.length());


        // charAt
        for(int i=0; i<fullName.length(); i++){
           System.out.println(fullName.charAt(i)); 
        }

    }
    
}
