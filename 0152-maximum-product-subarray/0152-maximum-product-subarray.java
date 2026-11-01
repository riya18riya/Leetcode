class Solution {
    public int maxProduct(int[] nums) {
        
        /*int ans = nums[0];

        for(int i = 0; i < nums.length; i++){
            int product = 1;

            for(int j = i; j < nums.length; j++){
                product = product * nums[j];
                ans = Math.max(ans, product);
            }
        }
        return ans; */

        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(nums[i], max * nums[i]);

            min = Math.min(nums[i], min * nums[i]);

            ans = Math.max(ans, max);
        }

        return ans;
    }
}  