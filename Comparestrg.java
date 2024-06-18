import java.util.*;
public class Comparestrg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // compare 
        String name1 = "Iron";
        String name2 = "Man";
        // s1 > s2 : +ve
        // s1 = s2 : 0
        // s1 < s2 : -ve

        // if(name1.compareTo(name2) == 0){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("String are not Equal");
        // }
        if (name1 == name2) {
            System.out.println("Strings are equa");
            
        }else{
            System.out.println("Strings are not equal");
        }
    }
    
}
