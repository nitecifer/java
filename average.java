//Enter the three numbers from the user and make a function to print their average.
import java.util.Scanner;
public class average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
         int Average=(a+b+c)/3;


        System.out.println(Average);
    }
}
    