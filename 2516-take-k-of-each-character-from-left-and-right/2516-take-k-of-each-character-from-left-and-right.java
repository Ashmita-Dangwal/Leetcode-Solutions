class Solution {
    public int takeCharacters(String s, int k) {
        int n = s.length();
        int [] count = new int[3];


        for(char c : s.toCharArray()){
            count[c-'a']++;
        }

        if(count[0] < k || count[1] < k || count[2] < k){
            return -1;
        }


        int l = 0;
        int maxWindow = 0;

        for(int i =0;i < n;i++){
            count[s.charAt(i) - 'a']--;

            while(count[s.charAt(i) - 'a'] < k) {
                count[s.charAt(l) - 'a']++;
                l++;
            }

            maxWindow = Math.max(maxWindow , i-l+1);
        }


        return n-maxWindow;
    }
}