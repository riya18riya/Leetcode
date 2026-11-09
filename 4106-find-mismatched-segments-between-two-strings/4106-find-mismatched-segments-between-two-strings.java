class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        
        List<List<String>> list = new ArrayList<>();
        
        int i = 0;
        int n = s1.length();

        while(i < n){
            
            if(s1.charAt(i) == s2.charAt(i)){ // same char skip
                i++;
            }
            else{
                int start = i;

                while(i < n && s1.charAt(i) != s2.charAt(i)){
                    i++;
                }

                String ans1 = s1.substring(start, i);
                String ans2 = s2.substring(start, i);

                list.add(Arrays.asList(ans1, ans2));
            }
        }
        return list;
    }
}