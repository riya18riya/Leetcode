class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);    //map = {t=1, r=1, e=2} FREQUENCY
        }

        ArrayList<Character> list = new ArrayList<>(map.keySet()); //list = [t, r, e]

        Collections.sort(list, (a, b) -> map.get(b) - map.get(a)); //descending order

        StringBuilder ans = new StringBuilder();

        for(char ch : list){ // take char
            int freq = map.get(ch); //get that char freq

            for(int i = 0; i < freq; i++){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}