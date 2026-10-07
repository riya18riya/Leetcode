class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);  // set{.......}
        }

        int longest = 0;

        // Iterate over unique elements only
        for (int num : set) {
            if (!set.contains(num - 1)) { //not present
                int current = num; //current ko starting point bna do 
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}