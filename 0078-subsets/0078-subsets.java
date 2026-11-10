class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<Integer> current = new ArrayList<>(); 
        List<List<Integer>> list = new ArrayList<>();   // [ [ ] ] 
        
        subsets(nums, 0, current, list);

        return list;
    }

    static void subsets(int[] nums, int i, List<Integer> current,  List<List<Integer>> list){
        
        // base case
        if (i == nums.length) {
            list.add(new ArrayList<>(current));
            return;
        }
        
        // include
        current.add(nums[i]);
        subsets(nums, i + 1, current, list);

        // exclude
        current.remove(current.size() - 1);
        subsets(nums, i + 1, current, list);
    } 
}