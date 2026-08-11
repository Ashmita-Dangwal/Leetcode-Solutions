class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] CharCounts = new int[26];

        for(int i=0; i<s.length();i++){
            CharCounts[s.charAt(i) -'a']++;
            CharCounts[t.charAt(i) -'a']--;
        }

        for(int counts: CharCounts){
            if(counts!=0){
                return false;
            }
        }

        return true;
    }
}