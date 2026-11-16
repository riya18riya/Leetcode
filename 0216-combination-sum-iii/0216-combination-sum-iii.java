class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
      
      List<Integer> current = new ArrayList<>();
      List<List<Integer>> list = new ArrayList<>();

      combination(1, k, n, 0, current, list);

        return list;
    }

    static void combination(int number, int k, int n, int sum, List<Integer> current, List<List<Integer>> list){
                      
        if(current.size() == k){
            if(sum == n){
                list.add(new ArrayList<>(current));
            }
            return;
        }

        for(int i = number; i <= 9; i++){

            if(sum + i > n){
                break;
            }

            current.add(i);

            combination(i+1, k, n, sum+i, current, list);

            current.remove(current.size() - 1);
        }
    }
}