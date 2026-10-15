class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1 , k , n , new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int num , int k , int target , List<Integer> current , List<List<Integer>> result){
        if(k ==0 && target == 0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(num > 9 || k < 0 || target < 0){
            return;
        }
        current.add(num);
        backtrack(num+1 , k-1, target - num ,current , result);
        current.remove(current.size()-1);

        backtrack(num+1, k , target, current , result);
    }
}