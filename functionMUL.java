import java.util.*;
public class functionMUL {
    public static int calculateProduct(int a, int b){
        int Mul = a*b;
        return Mul;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        int Mul = calculateProduct(a , b);
        System.out.println(Mul);

    }
    
}
