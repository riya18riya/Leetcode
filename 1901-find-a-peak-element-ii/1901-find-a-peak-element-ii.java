class Solution {
    public int[] findPeakGrid(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;

        int low = 0;
        int high = n-1;

        while (low <= high){
            int mid = low + (high - low) / 2;

            int row = 0;

            // max element // check top/bottom
            for (int i = 0; i < m; i++){

                if(mat[i][mid] > mat[row][mid]){
                    row = i;
                }
            }

            int left = -1;
            int right = -1;

            if (mid-1 >= 0){  //check left
                left = mat[row][mid-1];
            }

            if(mid+1 < n){   //check right
                right = mat[row][mid+1];
            }

            if (mat[row][mid] > left && mat[row][mid] > right){
                return new int[]{row,mid};
            }
            else if (mat[row][mid] < left){
                high = mid-1; //left side bada h toh left side search kro
            }
            else {
                low = mid+1; //right side bada h toh right side search kro
            }
        }
        
        return new int[]{-1,-1};
    }
}