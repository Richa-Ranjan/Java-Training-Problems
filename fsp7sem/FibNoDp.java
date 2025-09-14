import java.util.*;

public class FibNoDp {
    static int fib(int n,int[] dp){
        if(n==0 || n==1){
        return n;
    }
    if(dp[n] !=0){
        return dp[n];
    }
   dp[n] = fib(n-1,dp)+ fib(n-2,dp);
   System.out.println("For iteration" + n + " the dp is:" + Arrays.toString(dp));
   return dp[n];
}
public static void main(String[] args) {
    int n=5;
    int dp[]=new int[n+1];
    System.out.println(fib(n,dp));
}
}

