class Solution {
    public int climbStairs(int n) {

        /*if (n == 1) {    // T=O(n) S=0(1)
            return 1;
        }

        int prev1 = 1;
        int prev = 2;

        for (int i = 3; i <= n; i++) {
            int current = prev + prev1;

            prev1 = prev;
            prev = current;
        }

        return prev;*/



        /*if (n == 1) {        O(2^n)
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n - 2); // FIBONACCI RECURRENCE  */

        

        /*if(n <= 2){              //T=O(n) S=0(n)
            return n;
        }*/
        if(n == 0) return 1;
        if(n <= 2) return n;

        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n]; 

    }
}