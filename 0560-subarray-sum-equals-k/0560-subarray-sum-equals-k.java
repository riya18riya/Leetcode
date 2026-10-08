class Solution {
    public int subarraySum(int[] nums, int k) {

        // Optimal - Complexity O(n) using hashmap+prefix sum
        HashMap<Integer,Integer> map = new HashMap<>(); // map stores prefix sum and frequency

        map.put(0,1);

        int sum=0;
        int count=0;

        for(int num : nums){
            sum = sum + num;

            if(map.containsKey(sum-k)) {
                count = count + map.get(sum-k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
        

        /*  complexity: O(n^2)
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            int sum = 0; 

            for(int j = i; j < nums.length; j++){
                sum =  sum + nums[j];

                if(sum == k){
                    count++;
                }
            }
        }
        return count;      
        */
    }
}