class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> list = new ArrayList<>();

        if(digits.length() == 0){
            return list;
        }

        String[]  mapping = {"", "", "abc","def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        combination(digits, 0, "", mapping, list);
        return list;
    }
    public static void combination(String digits, int index, String current, String[] mapping, List<String> list){

        if (index == digits.length()) {
            list.add(current);
            return;
        }

        int number = digits.charAt(index) - '0';
        
        String letters = mapping[number];

        for (int i = 0; i < letters.length(); i++){
            char ch = letters.charAt(i);

            combination(digits, index+1, current+ch, mapping, list);
        }
    }
}