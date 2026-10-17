class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backTrack(result , new ArrayList<>() , nums , used);
        return result; 
    }
    private void backTrack(List<List<Integer>> result, List<Integer> current , int[] nums , boolean[] used){
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;
            if(i > 0 && nums[i] == nums[i-1] && !used[i-1]){
                continue;
            }
            used[i] = true;
            current.add(nums[i]);
            backTrack(result , current , nums , used);
            used[i] = false;
            current.remove(current.size()-1);
        }
    }
}