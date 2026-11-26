class Solution {

    public int uniquePaths(int m, int n) {

         int[][] dp = new int[m][n];

        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                dp[i][j] = dp[i-1][j] + dp[i][j-1];

            }
        }

        return dp[m-1][n-1];

        /*int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]= -1;
            }
        }

        return countWays(0, 0, m, n, arr);*/
    }

    /*public int countWays(int i, int j, int m, int n, int[][] arr) {

        // Destination
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        // out of range
        if (i >= m || j >= n) {
            return 0;
        }

        // Already calculated
        if (arr[i][j] != -1) {
            return arr[i][j];
        }

        // Calculate
        arr[i][j] = countWays(i + 1, j, m, n, arr) + countWays(i, j + 1, m, n, arr);

        return arr[i][j];

    }*/
}