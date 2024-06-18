import java.util.*;
public class StringBuilder1 {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Iron Man");
        System.out.println(sb);


        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0 , 'M');
        System.out.println(sb);

        // insert
        sb.insert(2 , 'o');
        System.out.println(sb);


        // delete the extra o
        sb.delete(2 , 3);
        System.out.println(sb);

    }
    
}
