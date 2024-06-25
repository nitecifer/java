import java.util.*;
public class kadane {
    public static int kadaneAlgo(int a[],int n){
        int mx=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(sum<0) sum=0;
            else{
                mx=Math.max(mx, sum);
            }
        }
        return mx;
    }
    public static void main(String[] args) {
        // int a[]={-2,-3,4,-1,-2,1,5,-3};
        int a[]={1,2,3,-2,5};
        int n=a.length;
        int maxSum=kadaneAlgo(a, n);
        System.out.println(maxSum);
    }
}
