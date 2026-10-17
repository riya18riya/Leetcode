class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int current = nums[i];

            int required = target-current;

            if(map.containsKey(required)){  //if exist in map

              return new int[]{map.get(required),i};

            }

            // if not exist
            map.put(current,i);
        }
        return new int[]{};


        /*int[] ans = new int[2];

            for(int i=0; i<nums.length; i++){

                for(int j=i+1; j<nums.length; j++){

                    if(nums[i]+nums[j]==target){

                        ans[0]=i;
                        ans[1]=j;

                        return ans;
                    }
                }
            } 

        return ans; */ 

    }
}
                