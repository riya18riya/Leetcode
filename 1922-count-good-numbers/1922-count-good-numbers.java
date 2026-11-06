class Solution {
    long MOD = 1000000007;
    
    public int countGoodNumbers(long n) {

        long even = (n+1) / 2;
        long odd = n / 2;

        long a = power(5, even);
        long b = power(4, odd);
 
        return (int) ((a * b) % MOD);

    }

    public long power(long x, long n){
            if (n == 0){
                return 1;
            }
            long half = power(x, n/2);
            long result = (half * half) % MOD;

            if(n % 2 == 1){                    //odd
                result = (result * x) % MOD;
            }
            return result;  //even
        }
}