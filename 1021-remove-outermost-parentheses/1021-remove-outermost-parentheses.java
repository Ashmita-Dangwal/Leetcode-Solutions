class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int opened = 0;
        for( char ch : s.toCharArray()){
            if(ch == '('){
                if(opened > 0){
                    result.append(ch);
                }
                opened++;
            }
            else{
                opened--;
                if(opened > 0){
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }
}