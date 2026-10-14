class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backTrack(result , new StringBuilder() , 0, 0 , n);
        return result;
    }
    private void backTrack(List<String>result , StringBuilder current, int openCount , int closeCount ,int n){
        if(current.length() == 2*n){
            result.add(current.toString());
            return;
        }
        if(openCount < n){
            current.append('(');
            backTrack(result, current , openCount+1 , closeCount , n);
            current.deleteCharAt(current.length()-1);
        }
        if(closeCount < openCount){
            current.append(')');
            backTrack(result, current , openCount , closeCount +1 , n);
            current.deleteCharAt(current.length()-1);
        }
    }
}