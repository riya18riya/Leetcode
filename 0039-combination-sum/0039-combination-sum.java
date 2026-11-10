class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<Integer> current = new ArrayList<>();  //[]
        List<List<Integer>> ans = new ArrayList<>(); //[[] []]

        combinations(0, candidates, target, current, ans);

        return ans;
    }

    public void combinations(int index, int[] candidates, int target, List<Integer> current, List<List<Integer>> ans){

        //basecase
        if(index == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(current));
            }
            return;
        }

        if(candidates[index] <= target){  //pick
            current.add(candidates[index]);

            combinations(index, candidates, target - candidates[index], current, ans);

            current.remove(current.size()-1); //backtracking
        }

        combinations(index + 1, candidates, target, current, ans);  //not pick
    }
}