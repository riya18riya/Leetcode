class Solution {
    public int fib(int n) {

        if (n <= 1){
            return n;
        }

        int[] dp = new int[n + 1];

        for(int i = 0; i <= n; i++){    //Arrays.fill(dp, -1)
            dp[i] = -1; 
        }

        if(dp[n] != -1) {
            return dp[n];
        }

        return dp[n] = fib(n-1) + fib(n-2);  //memorization

        /*
        if(n<=1){
        return n;
        }
        int[] dp =new int[n+1];
        dp[0]=0;
        dp[1]=1;

        for(int i=2; i<=n; i++){
        dp[i]= dp[i-1]+dp[i-2]
        }
        return dp[n];
        */

    }
}