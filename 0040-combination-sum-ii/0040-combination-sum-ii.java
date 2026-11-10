class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        
        List<Integer> current = new ArrayList<>();  //[]
        List<List<Integer>> ans = new ArrayList<>(); //[[] []]

        combinations(0, candidates, target, current, ans);

        return ans;
    }
    
    public void combinations(int index, int[] candidates, int target, List<Integer> current, List<List<Integer>> ans){

        //basecase
        if(target == 0){
            ans.add(new ArrayList<>(current));
            return;
        }

        for(int i = index; i < candidates.length; i++){

            if (i > index && candidates[i] == candidates[i-1]){  //skip
                continue;
            }

            if (candidates[i] > target){
                break;
            }

            current.add(candidates[i]);

            combinations(i+1, candidates, target - candidates[i], current, ans);

            current.remove(current.size() - 1);
        }
    }    
}