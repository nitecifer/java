public class overloading {
    static int plusMethod(int x , int y){
        return x + y;
    }
     static double plusMethod( double a , double b){
        return a + b ;
    }

public static void main(String[] args) {
    int num = plusMethod(3, 4);
    double num1 = plusMethod(4.1, 5.2);

    System.out.println(num);
    System.out.println(num1);
}
    
}
