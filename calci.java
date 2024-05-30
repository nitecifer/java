import java.util.*;
public class calci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number: ");
        int a= sc.nextInt();
        // System.out.println("Enter second number: ");
        int b=sc.nextInt();
        System.out.println("Enter operation(+,-,*,/): ");
        char calci=sc.next().charAt(0);
        
        switch(calci){
            case '+': 
                System.out.println("addition of to numbers "+(a+b));
            break;
            case '-':
            System.out.println("subtraction of two numbers "+(a-b));
            break;
            case '*':
            System.out.println("multiplication of two numbers "+(a*b));
            break;
            case '/':
            System.out.println("division of two numbers "+(a/b));
            break;

            default : System.out.println("Error");
        }

    }
    
}
