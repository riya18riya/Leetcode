class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        
        List<Integer> current = new ArrayList<>(); //[]
        List<List<Integer>> list = new ArrayList<>();   // [ [ ] ] 
        
        subsets(nums, 0, current, list);

        return list;
    }

    static void subsets(int[] nums, int index, List<Integer> current, List<List<Integer>> list){

        list.add(new ArrayList<>(current));
        
        for (int i = index; i < nums.length; i++){

            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            else{
                current.add(nums[i]);
                subsets(nums, i + 1, current, list);

                current.remove(current.size() - 1); //backtracking
            }
        }
    } 
}