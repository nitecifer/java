
import java.util.*;
public class Exercise3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n= sc.nextInt();
         int arr[] = new int[n];
         System.out.println("Enter element in array");
         for(int i=0 ; i<n; i++){
            arr[i]= sc.nextInt();
         }

         int sum = 0;
         for(int i:arr){
            sum += i;
            
         }
         System.out.println("this is average"+(double)sum/arr.length);
    }
    
}
