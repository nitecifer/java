import java.util.*;
public class Exercise4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of array");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int sum=0;
        for(int i:arr){
            sum += i;
        }
            System.out.println("this is average"+(double)sum/arr.length);
        
    }
    
}
