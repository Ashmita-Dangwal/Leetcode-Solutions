class Solution {
    public String sortVowels(String s) {
        int count[] = new int[128];
        char[] chars = s.toCharArray();

        for(char c : chars){
            if(isVowel(c)){
                count[c]++;
            }
        }
        int asciiptr = 0;
        for(int i = 0; i < chars.length; i++){
            if(isVowel(chars[i])){
                while(count[asciiptr] == 0){
                    asciiptr++;
                }
                chars[i] = (char)asciiptr;
                count[asciiptr]--;
            }
        }
        return new String(chars);
    }
    private boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
}