import java.util.Scanner;

public class itsMe {
    public static boolean isPalindrome(Integer n){
        int rev=0;
        int temp=n;
        while(temp!=0){
            rev=rev*10+temp%10;
            temp/=10;
        }
        return n==rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check weather it is palindrome or not: ");
        int n=sc.nextInt();
        if(isPalindrome(n)) System.out.println("Yes "+n+" is Palindrome.");
        else System.out.println("No "+n+" is not palindrome");
    }
}
