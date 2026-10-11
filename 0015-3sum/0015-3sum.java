class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(nums);

        for(int i=0; i < nums.length-2; i++){
            if (i > 0 && nums[i] == nums[i - 1]) { //to avoid use of same i number
                continue;  //skip and move to next different index
            }

            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    //same left value ko dobara use nahi hone deta.
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    //same right value ko dobara use nahi hone deta.
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
                else if (sum > 0) {
                    right--;
                }
                else{  //(sum < 0)
                    left++;
                }
            }
        }
        return ans;
    }
}