class Solution {
    String[] map = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits){
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0){
            return ans;
        }

        StringBuilder current = new StringBuilder();
        solve(digits, 0, current, ans);
        return ans;
    }

    private void solve(String digits, int index,StringBuilder current,List<String> ans){

        if(index == digits.length()){
            ans.add(current.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for(int i = 0; i < letters.length(); i++){
            current.append(letters.charAt(i));
            solve(digits, index + 1, current, ans);
            current.deleteCharAt(current.length() - 1);
        }
    }
}